package com.jagyasi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
record Person (String name, Integer age, Address address){
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
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
        return new Person("haresh",22,new Address("ABC","XYZ"));

    }
    @Bean(name = "address2") //name is used while getting bean from context
    public Address address(){
        return new Address("123 E-ward ","Ahmedabad");
    }
    @Bean
    public Address address2(){
        return new Address("E-19","Ahmedabad");
    }
    //constructor injection
    //1) using method calls

    @Bean
    public Person personMethodCalls(){

        return new Person(name(),age(),address2());
    }
    //2) Using Params
    @Bean
    public Person personParams(String name, Integer age,Address address2){
        return new Person(name,age,address2);
    }


}
