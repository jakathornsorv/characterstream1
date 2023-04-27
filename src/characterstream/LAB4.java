/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream;


import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

/**
 *
 * @author HP VICTUS
 */
public class LAB4 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Jakathorn Sorvises");
            output.println("19");
            output.println("45");
            output.println("165");
            output.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weigth = input.nextDouble();
            System.out.println(weigth);
            double height = input.nextDouble();
            System.out.println(height);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
}
