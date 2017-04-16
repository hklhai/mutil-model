package cn.edu.ncut.ssh.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import cn.edu.ncut.ssh.user.User;

/**
 * 
 * @author lenovo In http://docs.spring.io/spring/docs/current/javadoc-api/org/
 *         springframework/test/context/transaction/TransactionConfiguration.
 *         html, They say @TransactionConfiguration is "Deprecated" and
 *         "As of Spring Framework 4.2, use @Rollback or @Commit at the class level and the transactionManager qualifier in @Transactional"
 *         .
 *
 */
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Rollback
@Transactional
public class GetUserTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void test() {
		List<User> userList = userDao.getUserList();
		Assert.assertEquals(1, userList.size());
	}

}
