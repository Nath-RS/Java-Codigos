package meuprograma;

public class Professor extends Pessoa {
    private float salario;

    public float getSalario(){
        return this.salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public Professor(){}
    
    public Professor(float peso, String nome){
        super(peso, nome);
    }
    
    public Professor(String nome){
        super(70f, nome);
    }
    
    // Sobrescrita de métodos

    @Override
    public void anda(){
        float peso = this.getPeso();
        peso = peso * 0.95f;
        this.setPeso(peso);
    }
}
