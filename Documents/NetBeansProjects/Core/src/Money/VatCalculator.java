/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bladestorm
 */
public class VatCalculator {

    public static void main(String[] args) {

//        double money;
//        double tax ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter amount");
//        money = sc.nextDouble();
//        System.out.println("Enter vat");
//        tax = sc.nextDouble();
//
//        double vat = tax / 100;
//        double total = (money * vat) + money;
//        System.out.println("You have to pay :-" + total);

        
        try {
            BigDecimal money;
        BigDecimal tax;
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal total ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money");
        money = sc.nextBigDecimal();
        System.out.println("Enter vat");
        tax = sc.nextBigDecimal();
        
        
        BigDecimal vat = tax.divide(hundred);
        total = money.multiply(vat).add(money);
        System.out.println(total.setScale(2,RoundingMode.DOWN));
            
        } catch (InputMismatchException e) {
            System.out.println("Enter digits alphabet not valid");
        }

    }

}
