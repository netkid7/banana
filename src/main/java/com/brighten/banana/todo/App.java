package com.brighten.banana.todo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brighten.banana.todo.knight.Knight;
import com.brighten.banana.todo.service.GreetingMessageService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        GreetingMessageService greetingMessageService = context.getBean("greetingMessageServiceImpl", GreetingMessageService.class);
        System.out.println(greetingMessageService.greetUser());
        
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();
    }
}
