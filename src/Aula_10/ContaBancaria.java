package Aula_10;

public class ContaBancaria {
    private static int qtdeContas = 0;
    
    public ContaBancaria() {
        qtdeContas++;
    }

    public int getQtdeContas() {
        return qtdeContas;
    }

    public void setQtdeContas(int qtdeContas) {
        this.qtdeContas = qtdeContas;
    }
    
    public static void imprimir() {
        System.out.println(qtdeContas);
    }
}
