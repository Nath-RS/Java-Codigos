package teste;

public class Veiculo {
    protected int id;
    protected String marca,modelo;
    String cor;
    private long chassi;
    private double ano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public long getChassi() {
        return chassi;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{\n" + " id=\t" + id + ",\n marca=\t" + marca + ",\n modelo=\t" + modelo + ",\n cor=\t" + cor + ",\n chassi=\t" + chassi + ",\n ano=\t" + ano + '}';
    }
    
    
    
}
