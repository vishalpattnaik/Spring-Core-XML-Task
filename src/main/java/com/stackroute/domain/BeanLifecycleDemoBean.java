package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.SQLOutput;

//BeanLifecycleDemoBean implementing InitializingBean & DisposableBean

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

   private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void customInit() {

        System.out.println("This is some custom message in customInit() : " + message);

    }

    public void customDestroy() {

        System.out.println("This is some custom message in customDestroy() : " + message);

    }

    @Override
    public void afterPropertiesSet() {

        System.out.println("After Properties Set method called");

    }

    @Override
    public void destroy() {

        System.out.println("Destroy Method Called ");

    }

}
