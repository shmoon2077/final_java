package spring006_mybatis;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test_now {
	@Autowired ApplicationContext context;
	@Autowired DataSource dataSource;
	@Autowired TestDao dao;
	
	@Test public void test1() { System.out.println(dao.now());}


}
