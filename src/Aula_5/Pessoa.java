package Aula_5;

public class Pessoa {
    private String nome;
    private int idade;
    private String livro;
    private int diasDevolucao;

    public Pessoa() {
        System.out.println("Instancio objeto");
    }

    public Pessoa(String nome, int idade) {
        this();
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String livro, int diasDevolucao) {
        this(nome, idade);
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    public void emprestar(String livro) {
        this.livro = livro;
        this.diasDevolucao = 20;
              
    }
    
    public void emprestar(String livro, int dias) {
        this.livro = livro;
        this.diasDevolucao = dias;
    }
    
    public void imprimir(){
        String msg = "\n======================="
                +"\nNome: "+nome
                +"\nIdade: "+idade
                +"\nLivro: "+livro
                +"\nDias para devolver: "+diasDevolucao
                +"\n=======================";
        
        System.out.println(msg);
    }
} 
