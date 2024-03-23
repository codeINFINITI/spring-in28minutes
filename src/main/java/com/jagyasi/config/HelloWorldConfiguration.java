package com.jagyasi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
record Person (String name, Integer age){
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
};
;
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Jaideep";
    }
    @Bean
    public Integer age(){
        return 28;
    }
    @Bean
    public Person person(){
        return new Person("haresh",22);

    }
    @Bean() //name is used while getting bean from context
    public Address address(){
        return new Address("123 E-ward ","Ahmedabad");
    }
    @Bean
    public Address address2(){
        return new Address("E-19","Ahmedabad");
    }

}
