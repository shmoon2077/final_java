package spring005_ex_board;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BoardDao;
import com.company.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root.xml")
public class Test1_board {
	@Autowired ApplicationContext context;
	@Autowired DataSource dataSource;
	@Autowired BoardDao dao;
	
	//@Test public void test1() {System.out.println(context); }
	//@Test public void test2() {System.out.println(dataSource);}
	

	
	@Test public void insert() throws UnknownHostException {
		BoardDto dto = new BoardDto();
		dto.setBname("문성환");
		dto.setBpass("1234");
		dto.setBtitle("으아아아아아아악");
		dto.setBcontent("집에 가고 싶다.............");
		dto.setBhit(3);
		dto.setBip(InetAddress.getLocalHost().getHostAddress());
		System.out.println(dao.insert(dto));
		
		
	}
	
	
	
}