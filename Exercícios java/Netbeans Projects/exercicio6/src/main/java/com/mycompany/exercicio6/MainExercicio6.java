/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio6;

/**
 *
 * @author natha
 */
public class MainExercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int acumulador= 0;
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = (int) Math.round(Math.random()*10);
            System.out.println(vetor[i]);
        acumulador = acumulador + vetor[i];
        }
        
        
        System.out.printf("A soma dos %d numeros é %d ",vetor.length,acumulador);
        
    }
    
}
