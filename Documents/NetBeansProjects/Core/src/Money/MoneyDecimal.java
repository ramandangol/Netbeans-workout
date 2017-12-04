/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Money;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Bladestorm
 */
public class MoneyDecimal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        double revenue;
        DecimalFormat df = new DecimalFormat("RS ##,##0.00");
        System.out.println("Taw sanga kati paisa xa ?");
        revenue = sc.nextDouble();
        System.out.println("You have " + df.format(revenue));
        
       
//       String strRs = Double.toString(revenue);
//        System.out.println(strRs);
//        
//        BigDecimal moneyConvert = new BigDecimal(strRs);
//        moneyConvert = moneyConvert.add(moneyConvert).add(moneyConvert);
//        System.out.println("Total :- " + moneyConvert.toString() );
    }
    
    
}
