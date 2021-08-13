/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

import java.util.Scanner;

/**
 *
 * @author natha
 */
public class MainExercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Area do Retângulo ");
        System.out.println(" Digite o Tamanho da base do retângulo:\n");
        
        float base = teclado.nextFloat();
        
        System.out.println("Digite a Altura do retangulo:\n");
        
        float altura = teclado.nextFloat();
        
        float area = base * altura;
        System.out.println("A area do retangulo é: " + area);
    }
    
}
