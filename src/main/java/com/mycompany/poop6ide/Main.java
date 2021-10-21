/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop6ide;

/**
 *
 * @author Jhusteene
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase Empaquetada desde el IDE");
        System.out.println("La suma es: "+ suma(2,2));
        System.out.println("Nueva linea");
    }
    
    /**
     *retorna una suma de dos enteros, a y b
     * @param a numero entero primero
     * @param b segundo numero entero
     * @return la suma de a y b
     */
    public static int suma(int a, int b){
        return a+b;
    }
}
