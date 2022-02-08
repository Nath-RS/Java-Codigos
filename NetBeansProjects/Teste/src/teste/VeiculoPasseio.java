/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author natha
 */
public class VeiculoPasseio extends Veiculo{
    double valor;
    String dt_cadastro;
    private int km;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVeiculoPasseio{\n" + "valor=" + valor + ",\n dt_cadastro=" + dt_cadastro + ",\n km=" + km + '}';
    }
    
    
    
}
