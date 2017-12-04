/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OTP;

/**
 *
 * @author Bladestorm
 */
import java.util.Random;

public class GenerateOTP {
    
    static char[] sendOTP(int length){
        System.out.println("your otp for this transaction is :");
        String number="0123456789";
        Random r = new Random();
        char[] otp= new char[length];
        for(int i=0;i<length;i++){
            otp[i]= number.charAt(r.nextInt(number.length()));
        }
        return otp;
    }
    
    public static void main(String[] args) {
        System.out.println("generating otp................"); 
        System.out.println(sendOTP(4));
    }
    
}
