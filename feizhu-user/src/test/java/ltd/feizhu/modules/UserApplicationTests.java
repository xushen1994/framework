package ltd.feizhu.modules;

import ltd.feizhu.modules.pojo.user.entity.SysUserEntity;
import ltd.feizhu.modules.user.dao.SysUserDao;
import ltd.feizhu.modules.user.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {

	@Autowired
	private SysUserDao sysUserDao;


	@Test
	public void contextLoads() {
		//用户信息

		SysUserEntity userEntity = new SysUserEntity();
		userEntity.setCreateTime(new Date());
		userEntity.setMobile("18280376020");
		userEntity.setStatus(0);
		userEntity.setPassword("12233554444");
		userEntity.setUsername("595956"+System.currentTimeMillis());
		sysUserDao.insert(userEntity);

	}

}
