package com.jagyasi.driver;

import com.jagyasi.config.HelloWorldConfiguration;
import com.jagyasi.config.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring02 {
    public static void main(String[] args) {
        //1: Launch a spring context
        var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2:Using spring beans from context (configuring things we weant to manage in spring
        //HelloWorldConfiguration --@configuration
        //@Bean name
        String name=context.getBean("name",String.class);//explicit type conversion
        var age=context.getBean("age",Integer.class);// explicit not needed
        var person=context.getBean("person");//implicit casting
        System.out.println(name);
        System.out.println(person);
        var address =context.getBean("address2");
        System.out.println(address);

        System.out.println(context.getBean(Address.class));

        context.close();

    }
}
