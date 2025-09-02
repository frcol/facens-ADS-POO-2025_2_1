package Aula_3;

public class Main_Aluno {
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        alu.setNome("Fabio");
        alu.setRa("111111");
        alu.setCurso("ADS");
        
        System.out.println(alu.getRa());
        System.out.println(alu.getNome());
        System.out.println(alu.getCurso());
        
        
        Aluno alu2 = new Aluno();
        alu2.setRa("22222");
        alu2.setNome("Maria");
        alu2.setCurso("Jogos");
        
        System.out.println("");
        System.out.println(alu2.getRa());
        System.out.println(alu2.getNome());
        System.out.println(alu2.getCurso());
    }
}
