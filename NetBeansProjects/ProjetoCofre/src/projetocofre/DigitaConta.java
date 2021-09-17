
package projetocofre;

import java.util.Scanner;


public class DigitaConta {
    
    
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        int criarconta;
        do{
        System.out.println("Digite um numero para criar uma conta");
        System.out.println("1-Poupança.\t2-Corrente");
        criarconta = teclado.nextInt();
        }while(criarconta !=1& criarconta != 2);
        
        if(criarconta == 1){
            
        ContaPoupanca conta = new ContaPoupanca();
        
        System.out.println("=============================================");
        System.out.println("\tCadastro em conta Poupança");
        
        System.out.println("Digite o numero da conta:");
        conta.numeroConta = teclado.nextInt();
        
        System.out.println("Digite o numero do cliente:");
        conta.numeroCliente = teclado.nextInt();
        
        System.out.println("Digite a data de abertura:");
        conta.dataAbertura = teclado.next();
        
        System.out.println("Digite o valor do deposito:");
        conta.depositoConta(teclado.nextDouble());
        
        System.out.println("Digite o valor do saque");
        conta.saqueConta(teclado.nextDouble());
        
        System.out.println("Agora, seu saldo da conta poupança é : " + conta.saldo);
        }
        if(criarconta == 2){
            
        ContaCorrente conta = new ContaCorrente();
        
        System.out.println("=============================================");
        System.out.println("\tCadastro em conta Corrente");
        
        System.out.println("Digite o numero da conta:");
        conta.numeroConta = teclado.nextInt();
        
        System.out.println("Digite o numero do cliente:");
        conta.numeroCliente = teclado.nextInt();
        
        System.out.println("Digite a data de abertura:");
        conta.dataAbertura = teclado.next();
        
        System.out.println("Digite o valor do deposito:");
        conta.depositoConta(teclado.nextDouble());
        
        System.out.println("Digite o valor do saque");
        conta.saqueConta(teclado.nextDouble());
        
        System.out.println("Agora, seu saldo da conta Corrente é : " + conta.saldo);
        }
        
    }    
    }
