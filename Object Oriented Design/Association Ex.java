/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author fateh
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
     Bank bank = new Bank("Axis");
        Employee emp = new Employee("Neha");
         
        System.out.println(emp.getEmployeeName() + 
                " is employee of " + bank.getBankName());

    }
