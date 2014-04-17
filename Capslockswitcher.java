/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capslockswitcher;
import java.util.*;

/**
 *
 * @author f371996
 */
public class Capslockswitcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        String s = "";
        while(!s.equals("quit!")){
            System.out.print("Please enter a sentence in which the case sensitivity will be switched, or press quit! to cancel: ");
            s = reader.nextLine();
            String scopy = "";
            System.out.println("");
            
            int stringSize = s.length()-1;
            for(int i = 0; i < s.length(); i++){
                String a = s.substring(i, i+1);
                if(isUpperCase(a) == true){
                    a = a.toLowerCase();                  
                    scopy = scopy+a;
                 }
                else{
                    a= a.toUpperCase();
                    scopy = scopy+a;
                }
            }
            
            System.out.println(scopy);
        }
    }   
     public static boolean isUpperCase(String b){
         return !b.equals(b.toLowerCase());
     }    
    
        
        
}

