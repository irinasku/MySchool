/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import entity.Person;



/**
 *
 * @author Irina
 */
public class MySchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1 = new Person(1, "student" , "Ivan", "Ivanov", 22, 02, 1983);
        
        System.out.println(person1.toString());

        
    }
    
}
