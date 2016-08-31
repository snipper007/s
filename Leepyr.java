/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leepyr;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */
public class Leepyr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        if(t%4==0 && t%100!=0)
        {
            System.out.println("leap year");
        }
        else 
        {System.out.println("not a leap year");
        }
    }
}
