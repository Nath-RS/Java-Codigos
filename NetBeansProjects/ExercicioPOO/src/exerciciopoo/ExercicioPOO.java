
package exerciciopoo;

public class ExercicioPOO {
    
    
    
    public static void main(String[] args) {
        Produto p1,p2;
        ItemVenda venda1,venda2;
        var n2;
        
        p1= new Produto(303,"capao",10.5f);
        p2= new Produto(303,"capao",10.5f);
        
        venda1= new ItemVenda(355,p1,1);
        venda2= new ItemVenda(355,p2,1);
        
        System.out.println(venda1.toStringItemVenda());
        System.out.println("\n"+venda2.toStringItemVenda());
        System.out.println(venda1.equalsItemV(venda2));
        
        
    
    
    }
    
}
