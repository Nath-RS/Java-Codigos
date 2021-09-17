/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocofre;

/**
 *
 * @author natha
 */
public class Conta {
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor){
    saldo = saldo - valor;
    }
    
    void depositoConta(double valor){
        saldo = saldo + valor;
    }
    
    Conta(){
        saldo = 100.00;
    }
}
 