package com.thoughtworks.davenkin.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        BeanFactory beanfactory = new ClassPathXmlApplicationContext("spring.xml");
        BasicBean bean = (BasicBean) beanfactory.getBean("basic");
        System.out.println(bean.getMessage());
    }
}



