/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        if(d%2==0)
            System.out.println("even");
        else 
            System.out.println("odd");
    }
}
