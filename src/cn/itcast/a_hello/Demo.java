/**  

* Title: Demo.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月26日  

* @version 1.0  

*/
package cn.itcast.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.User;

public class Demo {
    
	@Test
	public void fun1(){
    	//1创建容器对象
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2向容器“要”user对象
		User user = (User) ac.getBean("user");
		
		System.out.println(user);
    }
}
