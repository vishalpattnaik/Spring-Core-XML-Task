package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("all")

public class Main {


    public static void main(String[] args) {
        
        //Application Context for retrieving details

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie11 = applicationContext.getBean("movie", Movie.class);
        System.out.println("\n\n-------Application Context------");
        System.out.println(movie11);
        Movie movie22 = applicationContext.getBean("movie2", Movie.class);
        System.out.println(movie22);

        System.out.println("\n\n--------beanA == beanB--------");
        System.out.println(movie11 == movie22);



    }


}

