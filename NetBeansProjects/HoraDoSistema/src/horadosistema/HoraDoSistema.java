
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;



public class HoraDoSistema {

   
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.print("A resolução da sua tela é " + d.width);
    System.out.println("x" + d.height);
    }
    
}
