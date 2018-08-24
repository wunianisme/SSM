package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wunian.dao.UserInfoDao;
import com.wunian.entity.UserInfo;
/**
 * UserInfoDaoµƒ≤‚ ‘¿‡
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {
	
	@Autowired
	private UserInfoDao userDao;

	@Test
	public void testFindUserById() {
		
		int id=1234567890;
		UserInfo user=userDao.findUserById(id);
		System.out.println(user.toString());
	}
}
