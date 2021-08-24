
package exerciciopoo;


public class Venda {
    private int codigo;
    private int quantidade;
    private Object itens;
    
    //Construtor
    public Venda(int codigo){
        
        this.setCodigo(codigo);
        
        this.itens = new Object[5];
    }
    
    
    
    //Métodos 
    private int getCodigo(){
        return this.codigo;
    }
    
    private void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
private String toStringVenda(){
    return "| INFORMAÇÕES DA VENDA |\nCódigo da Venda  "+this.getCodigo()
                +"\n\n"+this.itens.toStringItemVenda()
                +"\nQuantidade: "+this.quantidade;
}
    
}
