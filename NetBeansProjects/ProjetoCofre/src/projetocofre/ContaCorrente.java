
package projetocofre;


public class ContaCorrente extends Conta{
    double limite;
    int gerente;
    double taxaMensal;

@Override
 void saqueConta(double valor){
      if((saldo - valor)<0){
          System.out.println("ERRO: Saldo ficará abaixo de 0.00");
      }
      else saldo = saldo - valor;
    }
}