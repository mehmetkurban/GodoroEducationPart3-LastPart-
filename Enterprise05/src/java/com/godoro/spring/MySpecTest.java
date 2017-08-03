
package com.godoro.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MySpecTest {
    public static void main(String[] args) {
            ApplicationContext applicationContext
            =new ClassPathXmlApplicationContext("/springBeans.xml");
            
            MySpecClient mySpecClient=(MySpecClient) applicationContext.getBean("mySpecClient");
            int result=mySpecClient.decrement(5);
            System.out.println("Sonuç:"+result);
    }
}
