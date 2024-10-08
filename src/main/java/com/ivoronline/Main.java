package com.ivoronline;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

      ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
                                     context.registerShutdownHook();

      PersonService personService = context.getBean("personService", PersonService.class);
                    personService.insertRecords();

      context.close();

  }

}