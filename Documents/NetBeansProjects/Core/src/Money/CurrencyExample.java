/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Money;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Bladestorm
 */
public class CurrencyExample {
    public static void main(String[] args) {
        double rupees;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money !!");
        rupees = sc.nextDouble();
        
        String strRupees = Double.toString(rupees);
        
        BigDecimal db_rupees = new BigDecimal(strRupees);
        //add
        db_rupees = db_rupees.add(db_rupees).add(db_rupees);
        System.out.println("Total three times sum :-" + db_rupees);
        
        
       
    }
    
}
