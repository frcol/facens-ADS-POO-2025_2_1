package Aula_5;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        Pessoa p1 = new Pessoa("Fabio", 52);
        
        Pessoa p2 = new Pessoa("Joao", 33, "Harry Potter", 15);
    
        p1.emprestar("Star Wars");
        p2.emprestar("Ensaio sobre a cegueira", 7);
        
        p.imprimir();
        p1.imprimir();
        p2.imprimir();
        
    }
}
