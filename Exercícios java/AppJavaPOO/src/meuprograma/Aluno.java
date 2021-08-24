package meuprograma;

// Aluno HERDA Pessoa
// Herança: reutiliza propriedades e comportamentos da classe pai.
// - this: vejo a minha classe
// - super: vejo a classe pai
public class Aluno extends Pessoa {
    private int matricula;
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public Aluno() {}
    
    public Aluno(float peso, String nome){
        super(peso, nome);
    }
    
    public void efetuaInscricao(){
        // .....
    }
    
    @Override
    public void anda(){
        float peso = this.getPeso();
        peso = peso * 0.975f;
        this.setPeso(peso);
    }
}
