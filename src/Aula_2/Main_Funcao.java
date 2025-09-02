package Aula_2;

import java.util.Scanner;

public class Main_Funcao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Primeiro nome:");
        String nome = scan.next();
        
        System.out.println("Sobrenome:");
        String sobrenome = scan.next();
        
        String nomeC = nomeCompleto(nome, sobrenome);
        
        System.out.println(nomeC);
    }
    
    public static String nomeCompleto(String x, String y) {
        String resultado = x+" "+y;
        
        return resultado;
    }
}
