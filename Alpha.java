/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */
public class Alpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String d=s.nextLine();
        if(d.charAt(0)>='a'&&d.charAt(0)<='z')  
        {
            System.out.println("alphabet");
        }
        else 
            System.out.println("not a alphabet");
        }}

    