/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uno;

/**
 *
 * @author valle
 */
import java.util.Scanner;
public class Uno {

    public static void main(String[] args) {
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
        
        //Calculo cd = new Calculo(cd,ce,cpa);
        //Calculo ce = new Calculo(cd,ce,cpa);
        //Calculo cpa = new Calculo(cd,ce,cpa);
        //int cdf = cd.getCd();
        //int cef = ce.getCe();
        //int cpaf = cpa.getCpa();
        int cd = valor / d.getValor();
        int ce = valor / e.getValor();
        int cpa = valor / pa.getValor();
        
        System.out.println("El valor ingresado del dolar es "+d.getValor());
        System.out.println("El valor ingresado del euro es "+e.getValor());
        System.out.println("El valor ingresado del peso argentino es "+pa.getValor());
        //System.out.println(valor+ " pesos son "+cdf+" dolares");
        System.out.println(valor+ " pesos chilenos son "+cd+" dolares");
        System.out.println(valor+ " pesos chilenos son "+ce+" euros");
        System.out.println(valor+ " pesos chilenos son "+cpa+" pesos argentinos");
    }
}
