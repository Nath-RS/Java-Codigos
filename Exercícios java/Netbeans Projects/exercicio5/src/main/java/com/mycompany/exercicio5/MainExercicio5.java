/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5;


import java.util.Scanner;

/**
 *
 * @author natha
 */
public class MainExercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
        System.out.println("Digite sua idade :");
        int idade = teclado.nextInt();
        
        System.out.println("Quantos meses? ");
        int meses = teclado.nextInt();
        
        System.out.println("Quantos dias?");
        int dias = teclado.nextInt();
        
        int acumulador_dias = (idade * 365) + (meses * 30) + dias;
        System.out.println("Você tem " + acumulador_dias);
        
    }
    
}
