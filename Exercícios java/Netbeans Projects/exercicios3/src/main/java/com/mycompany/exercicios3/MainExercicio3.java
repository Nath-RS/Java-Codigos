/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicios3;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author natha
 * 
 * Escreva um algoritmo se um dado ano é bissexto.
 */
public class MainExercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o ano :\n");  
        int ano = teclado.nextInt();
        if(Year.isLeap(ano) == true){
            System.out.println("\nEsse ano é Bissexto");
        }
        else{
        System.out.println("\n Esse ano não é Bissexto");
        }
     
        
    }
    
}
