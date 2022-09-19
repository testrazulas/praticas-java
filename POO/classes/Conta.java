package Praticas.POO.classes;

public class Conta {
    private double saldo;

    public Conta() {
        saldo = 0.0;
    }

    public Conta(String nome, int anoAdocao, double peso) {
        this();
    }


    public double getSaldo(){
        return saldo;

    }

    public double depositar(double valor){
           return saldo += valor;
    }

    public double sacar(double valor){
        if (valor > 100){
            return saldo = saldo - (valor - valor*(0.01));
        }
            return saldo = saldo - valor;

    }

}
