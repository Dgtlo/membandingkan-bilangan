/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpembanding;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Contohpembanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print ("masukan bilangan ke-1 : ");
        x = scan.nextInt();
        System.out.print ("masukan bilangan ke-2 :");
        y = scan.nextInt();
        if (x>y)
        {
        System.out.println ("bilangan pertama ="+x+" lebih besar");
        }
        else
        {
            System.out.println ("bilangan kedua ="+y+" lebih besar");
        }
    }
    
}
