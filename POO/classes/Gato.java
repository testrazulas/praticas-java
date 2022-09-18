package POO.classes;

public class Gato {

    public String nome;
    public int anoAdocao;
    public double peso;

    private int idade;

    private double saldo;

    public Gato() {
        nome = "";
        anoAdocao = 0;
        peso = 0;
        saldo = 0.0;
    }

    public Gato(String nome, int anoAdocao, double peso) {
        this();
        this.nome = nome;
        this.anoAdocao = anoAdocao;
        this.peso = peso;
    }

    public int calculoIdade(){
        int anoAtual = 2022;
        idade = anoAtual - this.anoAdocao;
        return idade;
    }

    public String caminha(){
        String nome = this.nome;
        return nome + " está caminhando";
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

    public String parar(){
        return nome + " parou";
    }
}
