/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        boolean enRadianes; 
        int number;
        System.out.print("Para modo Radianes digite a, para modo Angulo, b: ");
        String radianOrDegree = in.nextLine();

        if (radianOrDegree.equalsIgnoreCase("b")) {
            enRadianes = false;
        } else {
            enRadianes = true;
        }

        System.out.print("Digite a para Sin, Cos o Tan, b para Arcsin, Arccos, Arctan, o c para Sinh, Cosh, Tanh: ");
        String operation = in.nextLine();
        switch (operation) {
            // Sin, Cos, Tan //
            case "a":
                System.out.print("Digite a para Sin, b para Cos, o c para Tan: ");
                String election = in.nextLine(); 
                switch (election) {
                    // Sin //
                    case "a":
                        System.out.print("Inserte el número al que le desea aplicar el Sin: "); 
                        System.out.println(Math.sin(devolverNumber(getNumber(), enRadianes)));
                        break;
                    // Cos //
                    case "b":
                        System.out.print("Inserte el número al que le desea aplicar el Cos: ");
                        System.out.println(Math.cos(devolverNumber(getNumber(), enRadianes)));
                        break;
                    // Tan //
                    case "c":
                        System.out.print("Inserte el número al que le desea aplicar el Tan: ");
                        System.out.println(Math.tan(devolverNumber(getNumber(), enRadianes)));
                        break;
                }
                break;
            // Arcsin, Arccos, Arctan // 
            case "b":
                System.out.print("Digite a para Arcsin, b para Arccos, o c para Arctan: ");
                String election2 = in.nextLine();
                switch (election2) {
                    // Arcsin //
                    case "a":
                        System.out.print("Inserte el número al que le desea aplicar el Arcsin: ");
                        System.out.println(Math.asin(devolverNumber(getNumber(), enRadianes)));
                        break;
                    // Arccos //
                    case "b":
                        System.out.print("Inserte el número al que le desea aplicar el Arccos: ");
                        System.out.println(Math.acos(devolverNumber(getNumber(), enRadianes)));
                        break;
                    // Arctan //
                    case "c":
                        System.out.print("Inserte el número al que le desea aplicar el Arctan: ");
                        System.out.println(Math.atan(devolverNumber(getNumber(), enRadianes)));
                        break;
                }
                break;
            
        }
    }
     private static double devolverNumber(int numero, boolean enRadianes) {
        if (enRadianes) {
            return Math.toRadians(numero);
        } else {
            return numero;
        }
    }
     
     private static int getNumber(){
        Scanner sc = new Scanner(System.in);
        int number; 
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, digite un numero");
            sc.next(); // this is important!
        }
        number = sc.nextInt(); 
         
         return number;
     }
}
