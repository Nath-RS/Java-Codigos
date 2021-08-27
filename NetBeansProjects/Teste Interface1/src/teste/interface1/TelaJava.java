/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.interface1;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class TelaJava extends JFrame {
    
    private int scale;
    private int with;
    private int height;
    
    public TelaJava(){
       with=300;
       height=200;
       scale=3;
       
       //Tamanho Da janela
       Dimension displaydimension= new Dimension(with*scale,height*scale);
       
       
       //Controle da janela
       this.setTitle("Teste de janela gráfica");
       this.setResizable(false);
       this.pack();
       this.setSize(displaydimension);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setVisible(true);
        //Componentes
      
      
       
    }
    
}
