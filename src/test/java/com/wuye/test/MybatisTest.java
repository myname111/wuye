package com.wuye.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class MybatisTest {
	@Autowired
	private ITestService testService;
   @Test
   public void method(){
	   com.wuye.bean.Test test =new com.wuye.bean.Test();
	   test.setPassword("123");
	   test.setUsername("aa");
	   testService.saveTest(test);
	   test = testService.getTestById(1);
	   System.out.println(test.getUsername());
   }
}
