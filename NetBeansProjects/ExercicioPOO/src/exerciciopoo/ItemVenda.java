/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo;

/**
 *
 * @author natha
 */
public class ItemVenda {
    private int codigo;
    private Produto produto;
    private int quantidade;
    
    public ItemVenda(int codigo,Produto produt,int quantidade){
        this.setCodigo(codigo);
        this.setProduto(produt);
        this.setQuantidade(quantidade);
    }
    //Metodos Get
    private int getCodigo(){
        return this.codigo;
    }
    
    private Produto getProduto(){
        return this.produto;
    }
    
    private int getQuantidade(){
        return this.quantidade;
    }
    //metodos Set
    private void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    private void setProduto(Produto product){
        this.produto = product;
    }
    
    private void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    //Metodo de exibição
    public String toStringItemVenda(){
        return "| INFORMAÇÕES DO ITEM |\nCódigo do item:  "+this.getCodigo()
                +"\n\n"+this.produto.toStringProduto()
                +"\nQuantidade: "+this.getQuantidade();
    }
    
    public boolean equalsItemV(ItemVenda item){
        if(this.quantidade == item.quantidade && this.codigo == item.codigo){
        
        return true;
    }
        return false;
    }
}