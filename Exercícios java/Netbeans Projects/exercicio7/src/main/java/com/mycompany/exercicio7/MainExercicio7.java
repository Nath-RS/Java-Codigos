/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7;

import java.util.Scanner;

/**
 *
 * @author natha
 */
public class MainExercicio7 {

    
    
    /**
     * @param args the command line arguments
     */
       private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
       }
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos números deseja inserir?");
        int quantidade = teclado.nextInt();
        int numerosprimos = 0;
        int vetor[]= new int[quantidade];
        
        for(int i= 0; i < vetor.length;i++){
            System.out.println("Digite um valor inteiro para o número " + (i + 1));
            vetor[i] = teclado.nextInt();
            
             if( ehPrimo(vetor[i]) ){
                 numerosprimos = numerosprimos + vetor[i];
              
        }    
            
            
        }
        
        System.out.println("A soma dos Número primos é "+ numerosprimos);
    }
    
}
