package Aula_8;

import java.util.ArrayList;

public class Main_Pessoa {
    public static void main(String[] args) {
       Professor p1 = new Professor("Fabio", "123123", "A1");
       Aluno a1 = new Aluno("Joao", "2222", "RA001");
       
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(p1);
        lstPessoas.add(a1);
        
        for (Pessoa p : lstPessoas) {
            System.out.println(p.imprimir());
            
            /*if (p instanceof Aluno) {
                ((Aluno) p).getRa();
            }*/
        }
        
        System.out.println(((Aluno)lstPessoas.get(1)).getRa());
    }
}
