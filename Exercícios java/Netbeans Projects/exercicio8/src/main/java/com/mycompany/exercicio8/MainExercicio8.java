/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8;

import java.util.Scanner;

/**
 *
 * @author natha
 */
public class MainExercicio8 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    float vetor[] = new float[10],acumulador=0f;
    
    for(int i=0;i < vetor.length;i++){
        System.out.println("Digite um numero para a posição " + i);
    vetor[i] = entrada.nextFloat();
        
        if(vetor[i]<20){
            acumulador = acumulador + vetor[i];
        }
    }
        System.out.println("A soma dos números inferiores a 20 é " + acumulador);
    
    }
    
}
