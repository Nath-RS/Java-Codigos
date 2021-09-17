package projetocofre;


public class ContaPoupanca extends Conta{
    String datasAniversários;
    
    @Override    
    void saqueConta(double valor){
      if((saldo - valor)<0){
          System.out.println("ERRO: Saldo ficará abaixo de 0.00");
      }
      else saldo = saldo - valor;
    }
}
