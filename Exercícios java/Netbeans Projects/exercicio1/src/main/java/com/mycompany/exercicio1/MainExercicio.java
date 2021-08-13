/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

/**
 *
 * @author natha
 *
 *  Exercícios da segunda aula de Estrutura de dados,
 * com o objetivo de passar algoritmos para treino da linguagem.
 */
public class MainExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valoresvetor[]= new int[4];
       int valormaior = 0;
       
       for(int i = 0;i < valoresvetor.length;i++){
           valoresvetor[i] = (int) Math.round(Math.random()*10);
           int y = i -1;
           System.out.println(valoresvetor[i]);
           }
       valormaior = valoresvetor[0];
       
       for(int i = 0; i < valoresvetor.length;i++){
           
            if(valoresvetor[i] > valormaior){
            valormaior = valoresvetor[i];
            }
       }
        System.out.println("Valor maior é " + valormaior);
       }
    }
