

package ltd.feizhu.modules.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import ltd.feizhu.modules.admin.dao.SysUserTokenDao;
import ltd.feizhu.modules.admin.service.SysUserTokenService;
import ltd.feizhu.modules.common.utils.R;
import ltd.feizhu.modules.pojo.user.entity.SysUserTokenEntity;
import ltd.feizhu.modules.shiro.oauth2.TokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements SysUserTokenService {
	//12小时后过期
	private final static int EXPIRE = 3600 * 12;

	@Autowired
	private SysUserTokenDao sysUserTokenDao;

	@Override
	public R createToken(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue();

		//当前时间
		Date now = new Date();
		//过期时间
		Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

		//判断是否生成过token
		SysUserTokenEntity tokenEntity = this.getById(userId);
		if(tokenEntity == null){
			tokenEntity = new SysUserTokenEntity();
			tokenEntity.setUserId(userId);
			tokenEntity.setToken(token);
			tokenEntity.setUpdateTime(now);
			tokenEntity.setExpireTime(expireTime);

			//保存token
			this.save(tokenEntity);
		}else{
			tokenEntity.setToken(token);
			tokenEntity.setUpdateTime(now);
			tokenEntity.setExpireTime(expireTime);

			//更新token
			this.updateById(tokenEntity);
		}

		R r = R.ok().put("token", token).put("expire", EXPIRE);

		return r;
	}

	@Override
	public void logout(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue();

		//修改token
		SysUserTokenEntity tokenEntity = new SysUserTokenEntity();
		tokenEntity.setUserId(userId);
		tokenEntity.setToken(token);
		this.updateById(tokenEntity);
	}


	/**
	 * @Author:xu shen
	 * Description:测试分布式事务
	 * LcnTransaction 分布式事务注解
	 * Transactional 本地事务注解
	 * @Date:Created in 2019/4/8 9:25
	 * @Modified By:
	 */
	@Override
	@Transactional
	@LcnTransaction
	public R txLcnInsertUserToken() {
		SysUserTokenEntity tokenEntity = new SysUserTokenEntity();
		tokenEntity.setUserId(System.currentTimeMillis());
		tokenEntity.setToken("56596995956986592365"+System.currentTimeMillis());
		sysUserTokenDao.insert(tokenEntity);
		return R.ok("ok-B");
	}
}
