package Aula_4;

import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        
        System.out.println("CPF: ");
        String cpf = scan.next();
        
        Pessoa p = new Pessoa(cpf, nome);
        System.out.println(p.imprimir());
        
        System.out.println("CM: ");
        String cm = scan.next();
        p.setCarteiraMotorista(cm);
        
        System.out.println(p.imprimir());
    }
}
