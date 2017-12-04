/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Bladestorm
 */
public class TestHasSet {
   
    public static void main(String[] args) {
        Set<String> set = new  HashSet<>();
        set.add("nepal");
        set.add("China");
        set.add("America");
        set.add("London");
        set.add("Japan");
        set.add("nepal");
        
        System.out.println(set);
        
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {            
//            System.out.println(iterator.next() + "");
//        }
        
        for(Object elements:set){
            System.out.println(elements.toString());
            
        }
    }
    
}
