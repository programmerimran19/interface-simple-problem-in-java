/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public class Display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Output:");
        Scanner Add = new Scanner (System.in);
        int id = Add.nextInt();
        String name = Add.next();
        
        Test T = new Test();
        T.show(id, name);
    }
    
}
