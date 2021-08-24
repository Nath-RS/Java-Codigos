package meuprograma;

// Pessoa.java
// Uma classe por arquivo.
// Classe é a representação de uma entidade do mundo real.
// Ex.: pessoa, estudante, empresa, animal, etc.


// Classe: Aluno
// Propriedades (atributos): Matricula, Nome, Turma, Curso
// Comportamentos (métodos): AcessarAulaOnline, TrancarDisciplinar, etc.
// - AcessarAulaOnline
//      - Para acessar a aula online, o método deverá verificar se o aluno
//        realizou login na plataforma da instituição.
//        - Se o aluno estiver conectado, uma nova janela será aberta e os 
//          elementos da aula (quadro branco, webcam do professor, participantes
//          na sala) deverão ser exibidos;
//        - Se o aluno não estiver conectado, ele deverá ser encaminhado à
//          página principal da plataforma para realizar o login.
// Objetos: Maria, Carlos, João, etc.
public class Pessoa {
    // Propriedades (atributos)
    private String nome;
    private int idade;
    private float peso;
    private char sexo;
    
    // Encapsulamento
    // Técnica utilizada para proteger as informações.
    // get: recupera a informação (tipo de dado do objeto, return)
    // set: define a informação (void, parâmetro de entrada)
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float peso){
        if (peso > 0f){
            this.peso = peso;
        }
    }
    
    // Construtor
    // Porta de entrada da classe
    public Pessoa() {
        this.setPeso(0.1f);
    }
    
    // Sobrecarga de métodos (construtor)
    public Pessoa(float peso){
        this.setPeso(peso);
    }
    
    public Pessoa(float peso, String nome){
        this.setPeso(peso);
        this.setNome(nome);
    }
    
    // Comportamentos (métodos)
    // Métodos devem alterar as propriedades da classe.
    // Métodos são verbos de ação completos ("anda", em vez de "andar").
    public void anda() {
        //this.peso = this.peso * 0.9955f;
        float peso = this.getPeso();
        peso = peso * 0.99f;
        this.setPeso(peso);
    }
    
    @Override
    public String toString(){
        return this.getNome() + "|" + this.getPeso();
    }   
}
