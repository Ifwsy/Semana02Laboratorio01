/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uno;

/**
 *
 * @author mplab4.pc07
 */
import java.util.Scanner;
public class Uno {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese el valor del dolar");
        int vd = l.nextInt();
        Moneda d = new Moneda(vd,"Dolar");
        System.out.println("Ingrese el valor del euro");
        int ve = l.nextInt();
        Moneda e = new Moneda(ve,"Euro");
        System.out.println("Ingrese el valor del peso argentino");
        int vpa = l.nextInt();
        Moneda pa = new Moneda(vpa,"Peso argentino");
        
        
        System.out.println("Ingrese el monto a convertir");
        int valor = l.nextInt();
        
        int cd = valor / d.getValor();
        int ce = valor / e.getValor();
        int cpa = valor / pa.getValor();
        
        System.out.println(d);
        System.out.println(e);
        System.out.println(pa);
        System.out.println(valor+ " pesos son "+cd+" dolares");
        System.out.println(valor+ " pesos son "+ce+" dolares");
        System.out.println(valor+ " pesos son "+cpa+" dolares");
    }
}
