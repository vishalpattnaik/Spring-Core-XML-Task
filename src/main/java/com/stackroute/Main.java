package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("all")

public class Main {


    public static void main(String[] args) {

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
//        Movie movie1 = factory.getBean("movie1", Movie.class);
//        Movie movie2 = factory.getBean("movie2", Movie.class);
//        System.out.println("-------Bean Factory------");
//        System.out.println(movie1.getActor());
//        System.out.println(movie2.getActor());
//
//        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("bean.xml"));
//        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(registry);
//        System.out.println("\n\n-------Bean Definition Registry------");
//        Movie mov1 = ((XmlBeanFactory)factory).getBean("movie1", Movie.class);
//        Movie mov2 = ((XmlBeanFactory)factory).getBean("movie2", Movie.class);
//        System.out.println(mov1.getActor());
//        System.out.println(mov2.getActor());

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Movie movie11 = applicationContext.getBean("movie", Movie.class);
//        System.out.println("\n\n-------Application Context------");
//        System.out.println(movie11);
//        Movie movie22 = applicationContext.getBean("movie", Movie.class);
//        System.out.println(movie22);
//
//        System.out.println("\n\n--------beanA == beanB--------");
//        System.out.println(movie11 == movie22);
//
//        BeanLifecycleDemoBean beanLifecycleDemoBean = applicationContext.getBean("beanlifecycledemo", BeanLifecycleDemoBean.class);
//        beanLifecycleDemoBean.afterPropertiesSet();
//        beanLifecycleDemoBean.destroy();

       AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        applicationContext.registerShutdownHook();

     //   BeanPostProcessorDemoBean beanPostProcessorDemoBean = applicationContext.getBean("beanpostprocessordemobean", BeanPostProcessorDemoBean.class);
     //   beanPostProcessorDemoBean.postProcessBeforeInitialization(beanPostProcessorDemoBean, beanpostprocessordemobean);

    }


}

