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
            if (p instanceof Aluno) {
                ((Aluno) p).getRa();
            }
        }
        
        System.out.println(((Professor)lstPessoas.get(1)).getRa());
    }
}
