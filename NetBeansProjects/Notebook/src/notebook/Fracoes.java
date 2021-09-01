
package notebook;


public class Fracoes {
    
    private int denominador= 0;
    private int numerador= 0;
  
    //Principal-------------------------------------
    public static void main(String[] args) {
        Fracoes fracao1= new Fracoes(7,10);
        Fracoes fracao2= new Fracoes(1,10);
        Fracoes resultado= new Fracoes();
        
        resultado.soma(fracao1, fracao2);
        
        System.out.println(resultado.getDenominador()+ "/" + resultado.getNumerador());
        resultado.subtrai(fracao1, fracao2);
        System.out.println(resultado.getDenominador()+ "/" + resultado.getNumerador());
        resultado.multiplica(fracao1, fracao2);
        System.out.println(resultado.getDenominador()+ "/" + resultado.getNumerador());
        
    }
    
    //Construtores
    public Fracoes(){
        this.denominador = 1;
        this.numerador = 1;
    }
    public Fracoes(int d,int n){
        this.denominador = d;
        this.numerador = n;
    }
    //Métodos get (opcional)
    private int getNumerador(){
        return this.numerador;
    }
    private int getDenominador(){
        return this.denominador;
    }
    //Métodos.
    private void soma(Fracoes obj1,Fracoes obj2){
        if(obj1.numerador != obj2.numerador){
        this.numerador = obj1.numerador * obj2.numerador;
        this.denominador = obj2.numerador * obj1.denominador + obj1.numerador * obj2.denominador;
        }
        else{
          this.numerador = obj1.numerador;
          this.denominador = obj1.denominador + obj2.denominador;
        }
    }
    
    private void subtrai(Fracoes obj1,Fracoes obj2){
        if(obj1.numerador != obj2.numerador){
        this.numerador = obj1.numerador * obj2.numerador;
        this.denominador = obj2.numerador * obj1.denominador - obj1.numerador * obj2.denominador;
        }
        else{
          this.numerador = obj1.numerador;
          this.denominador = obj1.denominador - obj2.denominador;
        }
    }
    
    private void multiplica(Fracoes obj1,Fracoes obj2){
        this.numerador = obj1.numerador * obj2.numerador;
        this.denominador = obj1.denominador * obj2.denominador;
    }
}
