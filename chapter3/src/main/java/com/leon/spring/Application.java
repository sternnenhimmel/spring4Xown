package com.leon.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by user14 on 11/21/17.
 */
@SpringBootApplication
@EnableTransactionManagement
public class Application {
  public static void main(String[]args) throws Exception{
    SpringApplication.run(Application.class,args);
  }
}
