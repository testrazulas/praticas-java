package Praticas.POO;

import Praticas.POO.classes.*;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Gatos {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        double valor = 0.0;

        Gato g1 = new Gato();
        g1.nome = "Panda";
        InfoGatos.user = g1.nome;
        g1.anoAdocao = 2017;
        g1.calculoIdade();
        g1.peso = 3.2;

        System.out.println(InfoGatos.user);
        System.out.println(InfoGatos.setVersao("Versão Documento - 2.0.0. "));
        System.out.println();
        System.out.println(g1.nome);
        System.out.println(g1.anoAdocao);
        System.out.println(g1.calculoIdade());
        System.out.println(g1.peso);
        System.out.println(g1.caminha() + " até o banco");
        System.out.println("e viu que seu saldo era: " + g1.getSaldo());
        System.out.print("Informe valor de depósito: ");
        double deposito = entrada.nextDouble();
        System.out.print("Valor depositado é de : " + deposito + "\n");
        double novoSaldo = g1.depositar(deposito);
        System.out.println(g1.nome + " seu novo saldo é de : " + novoSaldo);
        System.out.print("Informe valor do saque: ");
        double saque = entrada.nextDouble();
        double novoValor = novoSaldo - g1.sacar(saque);
        System.out.println(g1.nome + " seu novo saldo é de : " + g1.getSaldo());
        System.out.println(g1.parar()+"\n");


        /*Gato g2 = new Gato("Cuscuz", 2018, 5.5);
        g2.calculoIdade();
        g2.caminha();
        g2.parar();

        System.out.println(g2.nome);
        System.out.println(g2.anoAdocao);
        System.out.println(g2.calculoIdade());
        System.out.println(g2.peso);
        System.out.println(g2.caminha());
        System.out.println(g2.parar());
                                        */
    }
}
