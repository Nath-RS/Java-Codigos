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
public class VeiculoCarga extends Veiculo{
    double valor;
    String dt_cadastro;
    private int Km;
    String tipodecarga;

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
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    public String getTipodecarga() {
        return tipodecarga;
    }

    public void setTipodecarga(String tipodecarga) {
        this.tipodecarga = tipodecarga;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\nVeiculoCarga{\n" + "valor=\t" + valor + ",\n dt_cadastro=\t" + dt_cadastro + ",\n Km=\t" + Km + ",\n tipodecarga=\t" + tipodecarga + '}';
    }
    
    
}
