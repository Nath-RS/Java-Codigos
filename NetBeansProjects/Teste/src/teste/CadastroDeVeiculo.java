package teste;

 import javax.swing.JOptionPane;


public class CadastroDeVeiculo {

    public static void main(String[] args) {
        String leitura;
        int indice;
        
        do{
            
        leitura = JOptionPane.showInputDialog(null,"Escolha Um tipo de Veículo\n 1--\t Veiculo Carga\n 2--\t Veiculo Passeio\n ou qualquer numero para sair.");
        
        indice = Integer.parseInt(leitura);
        
        if(indice == 1){
            VeiculoCarga cr = new VeiculoCarga();
            
            cr.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"A id do veiculo: ")));
            
            cr.setMarca(JOptionPane.showInputDialog(null,"Marca do veiculo: "));
            cr.setModelo(JOptionPane.showInputDialog(null,"Modelo do veiculo: "));
            cr.setCor(JOptionPane.showInputDialog(null,"Cor do veiculo: "));
            cr.setChassi(Integer.parseInt(JOptionPane.showInputDialog(null,"Chassi do veiculo: ")));
            cr.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Ano do veiculo: ")));
            
            cr.setDt_cadastro(JOptionPane.showInputDialog(null,"Data de cadastro do veiculo: "));
            cr.setTipodecarga(JOptionPane.showInputDialog(null,"Tipo de Carga: "));
            cr.setKm(Integer.parseInt(JOptionPane.showInputDialog(null,"KM rodado: ")));
            cr.setValor(Integer.parseInt(JOptionPane.showInputDialog(null,"Valor do veiculo: ")));
            
            JOptionPane.showMessageDialog(null,cr.toString());
            
            indice = JOptionPane.showConfirmDialog(null,"Deseja Realizar um novo cadastro ?");
        }
        if(indice == 2){
            VeiculoPasseio cr = new VeiculoPasseio();
            
            cr.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"A id do veiculo: ")));
            
            cr.setMarca(JOptionPane.showInputDialog(null,"Marca do veiculo: "));
            cr.setModelo(JOptionPane.showInputDialog(null,"Modelo do veiculo: "));
            cr.setCor(JOptionPane.showInputDialog(null,"Cor do veiculo: "));
            cr.setChassi(Integer.parseInt(JOptionPane.showInputDialog(null,"Chassi do veiculo: ")));
            cr.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Ano do veiculo: ")));
            
            cr.setDt_cadastro(JOptionPane.showInputDialog(null,"Data de cadastro do veiculo: "));
            cr.setKm(Integer.parseInt(JOptionPane.showInputDialog(null,"KM rodado: ")));
            cr.setValor(Integer.parseInt(JOptionPane.showInputDialog(null,"Valor do veiculo: ")));
            
            JOptionPane.showInputDialog(cr.toString());
            
            JOptionPane.showConfirmDialog(null,"Deseja Realizar um novo cadastro ?");
        }
            
         } while(indice == 0);
        
    }
    
}
