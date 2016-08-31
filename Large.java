/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package large;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */
public class Large {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int e=s.nextInt();
        int e1=s.nextInt();
        int e2=s.nextInt();
        if(e>e1&&e>e2)
        {
            System.out.println("e is greater");
        }
        else if(e1>e&&e1>e2)
        {
            System.out.println("e1 is greater");
        }
        else
        {
            System.out.println("e2 is greater");
        }
    }
}
