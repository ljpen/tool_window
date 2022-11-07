package org.intellij.sdk.toolWindow;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class starter {
    public static void main( String[] args ) {
        //获取Spring上下文环境
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        //获取指定bean对象
        NameTask nameTask = (NameTask) beanFactory.getBean("nameTask");
        EmailTask emailTask = (EmailTask) beanFactory.getBean("emailTask");
    }
}