package Aula_10;

public class Main_Conta {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        System.out.println(c.getQtdeContas());
        
        ContaBancaria c2 = new ContaBancaria();
        System.out.println(c2.getQtdeContas());
        System.out.println(c.getQtdeContas());
        
        c2.setQtdeContas(10);
        System.out.println(c.getQtdeContas());
        
        ContaBancaria c3 =  new ContaBancaria();
        
        ContaBancaria.imprimir();
        System.out.print(c3);
    }
}
