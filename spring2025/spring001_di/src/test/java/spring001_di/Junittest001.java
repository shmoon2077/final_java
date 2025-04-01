package spring001_di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.Calc;
import com.company.ioctest.MyArea;

//1. Spring ioc 컨테이너 생성
//2. 경로 설정

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans001.xml")
public class Junittest001 {
	@Autowired ApplicationContext context; // 3. Bean (spring 관리하는 객체)
	          //ApplicationContext - bean 등록 생성 조회 반환관리
	  //@Autowired - 객체를 있는지 검사하고 있다면 자동으로 연결

@Test //@Ignore

	public void test1() {
		Calc calc1 = context.getBean( "rect" , Calc.class);
		Calc calc2 = (Calc) context.getBean("tri");
		MyArea myArea = context.getBean("myArea", MyArea.class);
		//assertEquals ("예상값", "처리할 값");
		assertEquals ("sally>15.0", myArea.mycalc(10,3));
	}
	@Ignore
	public void test2( ) {
		MyArea area1 = context.getBean("myArea", MyArea.class);
		MyArea area2 = context.getBean("myArea", MyArea.class);
		assertSame(area1,area2);
		
	}



}
