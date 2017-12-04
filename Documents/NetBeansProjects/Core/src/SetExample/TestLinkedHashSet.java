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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    
    public static void main(String arg[]){
       Set<String> set = new LinkedHashSet<String>();
       set.add("Nepal");
       set.add("Japan");
       set.add("America");
       set.add("London");
       set.add("London");
       
       System.out.println(set);
       
//       Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {            
//            System.out.println(iterator.next());
//        }

    for(Object element: set){
        System.out.println(element.toString());
    }
    }
    
}
