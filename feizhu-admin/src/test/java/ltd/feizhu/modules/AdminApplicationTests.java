package ltd.feizhu.modules;

import ltd.feizhu.modules.pojo.user.entity.SysUserEntity;
import ltd.feizhu.modules.admin.dao.SysUserDao;
import ltd.feizhu.modules.admin.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {

	@Autowired
	private SysUserDao sysUserDao;


	@Test
	public void contextLoads() {
		//用户信息

		System.out.println(sysUserDao.getAccountList());

		System.out.println(sysUserDao.queryByUserName("admin"));
	}

}
