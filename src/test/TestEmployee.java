package test;

import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tombisnis@yahoo.com 
 */
public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
        
        Employee employee = (Employee) applicationContext.getBean("employee");
        
        System.out.println("Id : "+employee.getId());
        System.out.println("Name : "+employee.getName());
        System.out.println("Address : "+employee.getAddress());
    }
}