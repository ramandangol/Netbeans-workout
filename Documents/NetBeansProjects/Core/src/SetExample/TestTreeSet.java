/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetExample;

/**
 *
 * @author Bladestorm
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    
    public static void main(String arg[]){
        Set<String> set = new HashSet<String>();
        set.add("Nepal");
        set.add("Japal");
        set.add("China");
        set.add("America");
        set.add("Nepal");
        
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        
        for(Object elements:set){
            System.out.println(elements);
        }
        
    }
    
}
