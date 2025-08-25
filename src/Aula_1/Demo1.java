package Aula_1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int num;
        
        do{
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
        } while(num >= 0);
        
        System.out.println("Encerrando...");

    }
}
