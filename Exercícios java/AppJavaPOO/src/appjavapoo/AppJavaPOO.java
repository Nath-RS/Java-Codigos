package appjavapoo;

import meuprograma.*;

public class AppJavaPOO {

    public static void main(String[] args) {
        // Criando a variável da classe
        // Pessoa p = new Pessoa();
        Pessoa p;
        
        // Utilizar a variável
        // Instância da classe (objeto): colocar o objeto na memória
        p = new Pessoa(70f, "João");
        
        // Utilizar uma propriedade
        //p.setNome("João");
        //p.setPeso(70);
        p.anda();
        p.anda();
        p.anda();
        
        // Exibe as informações
        //System.out.println("Nome: " + p.getNome());
        //System.out.println("Peso: " + p.getPeso() + "Kg");
        
        /* Aluno */
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setPeso(50f);
        
        // Polimorfismo
        // Poli = muitos
        // Morfos = formas
        // EM JAVA, TUDO É UM OBJETO
        // TUDO HERDA DA CLASSE OBJECT
        Pessoa p1 = new Pessoa(80, "Carlos");
        Pessoa p2 = new Aluno(80, "Maria");
        Pessoa p3 = new Professor(80, "Roberto");
        
        p1.anda();
        p2.anda();
        p3.anda();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }    
}

