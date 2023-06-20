package com.archana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("configure.xml");
    			
       teacher t = ac.getBean("thr",teacher.class);
      // Student s = ac.getBean("Std",Student.class);
       
       t.Msg();
       //s.stdMsg();
    }
}
