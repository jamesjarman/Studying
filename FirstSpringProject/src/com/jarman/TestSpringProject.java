package com.jarman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

    public static void main(String[] args) {
        // find and load SpringConfig.xml into app context - this is the basioc interface to access Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

        // tell spring to make an object using the bean
        Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");

        restaurant.greetCustomer();
    }
}
