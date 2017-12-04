/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;


public class InputFromUser {
    
    public static void main(String[] args) {
        String firstname,lastname,fn;
        
        int age;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First name :-");
        firstname = sc.next();
        if(!firstname.matches("[a-zA-Z_]+")){
            System.out.println("Input String only");
        }else{
            System.out.println("Your first name is :-" +firstname);
        }
//        System.out.println("Your first name is:- " +firstname);
//        
//        System.out.println("Enter your last name :-");
//        lastname = sc.next();
//        System.out.println("Your last name is " +lastname);
//        
//        System.out.println("Enter your age");
//        age = sc.nextInt();
//        System.out.println("Your age is "+age);
    }
    
}
