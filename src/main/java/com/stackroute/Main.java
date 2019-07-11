package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.rmi.registry.Registry;

@SuppressWarnings("all")

public class Main {


    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Movie movie1 = factory.getBean("movie1", Movie.class);
        Movie movie2 = factory.getBean("movie2", Movie.class);
        System.out.println("-------Bean Factory------");
        System.out.println(movie1);
        System.out.println(movie2);

        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(registry);
        System.out.println("\n\n-------Bean Definition Registry------");
        Movie mov1 = ((XmlBeanFactory)factory).getBean("movie1", Movie.class);
        Movie mov2 = ((XmlBeanFactory)factory).getBean("movie2", Movie.class);
        System.out.println(mov1);
        System.out.println(mov2);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie11 = applicationContext.getBean("movie1", Movie.class);
        System.out.println("\n\n-------Application Context------");
        System.out.println(movie11);
        Movie movie22 = applicationContext.getBean("movie2", Movie.class);
        System.out.println(movie22);



    }


}

