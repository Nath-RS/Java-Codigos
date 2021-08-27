/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo;


public class Produto {
   
    //Atributos
    private int codigo;
    private String descricao;
    private float valorUnitario;
    
    //Contrutor padrão
    public Produto(){
        String[] randomdescr = {"arroz","Feijão","Abóbora","Açucar"};
        int loteria =(int) Math.round(Math.random()*3);
        
      this.codigo =(int) Math.round(Math.random()*1000);   
      this.descricao = randomdescr[loteria];
      this.valorUnitario = 10.00f; 
    }
    //Construtor com 3 parametros
    public Produto(int codigo,String descricao,float valorUnitario){
      this.setcodigo(codigo);
      this.setDescricao(descricao);
      this.setValorUnitario(valorUnitario);    
    }
    
    
    private int getcodigo(){
     return this.codigo;
    }
    
    private void setcodigo(int codigo){
     this.codigo = codigo;   
    }
    
    private String getDescricao(){
     return this.descricao;
    }
    private void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    private float getValorUnitario(){
        return this.valorUnitario;
    }
    
    private void setValorUnitario(float valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    
    
    String toStringProduto(){
       return "Código Produto:\t" + this.getcodigo() + "\nDescrição:\t" + this.getDescricao() + "\nValor Unitário:\t" + this.getValorUnitario();
    }
    
    
    public boolean equals(Produto obj){
    if(this.descricao == obj.descricao && this.valorUnitario == obj.valorUnitario){
        if(this.codigo == obj.codigo){
        return true;}
    }
    return false;    
    }
    
    
}
