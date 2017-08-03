
package com.godoro.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanTest {
    public static void main(String[] args) {
         ApplicationContext applicationContext
            =new ClassPathXmlApplicationContext("/springBeans.xml");
         MyBean myBean= (MyBean) applicationContext.getBean("myBean");
         System.out.println("Uzun"+myBean.getMyLong());
         System.out.println("Katar"+myBean.getMyString());
         System.out.println("Kesirli"+myBean.getMyDouble());
    }
   
}
