package Praticas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClimaTempo {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0");

        System.out.print("Qual cidade você está? ");
        String cidade = entrada.nextLine();

        System.out.println();
        System.out.print("Informe a temperatura da sua cidade, em celsius: ");
        double celsius = entrada.nextDouble();

        System.out.println();
        System.out.println("A temperatura de " + cidade + " é de " + formatador.format(celsius) + " ºC ");

        if (celsius < 0){
            System.out.println("Muito frio, Proteja-se bem. ");
            System.out.println("-------------------------------");
            System.out.println("Informe uma condição do clima: ");
            System.out.println("1. Está chovendo");
            System.out.println("2. Está Ensolarado");
            System.out.println("Escolha a opção: ");
            System.out.println("------------------------------- ");
            int chuva = entrada.nextInt();
                if (chuva == 1){
                System.out.println("Está chovendo ainda? Nem se arrisque sair!!");
                }  else if (chuva == 2){
                    System.out.println("Pelo menos tem sol!");
                }  else {
                    System.out.println("VocÊ não digitou a opção correta");
            }
        } else if (celsius >= 0 && celsius < 5){
            System.out.println("Frio, Não se esqueça de usar o casaco");
            System.out.println("-------------------------------");
            System.out.println("Informe uma condição do clima: ");
            System.out.println("1. Está chovendo");
            System.out.println("2. Está Ensolarado");
            System.out.println("Escolha a opção: ");
            System.out.println("------------------------------- ");
            int chuva = entrada.nextInt();
                if(chuva == 1){
                    System.out.println("Você precisa sair mesmo? Leve um guarda-chuva!");
                } else if(chuva == 2){
                    System.out.println("Olha, o sol pode lhe esquentar");
                } else{
                    System.out.println("Você digitou a opção inválida! ");
                }
        } else if (celsius >= 5 && celsius < 10){
            System.out.println("Friaca, Cuide e se agaselhe!");
            System.out.println("-------------------------------");
            System.out.println("Informe uma condição do clima: ");
            System.out.println("1. Está chovendo");
            System.out.println("2. Está Ensolarado");
            System.out.println("Escolha a opção: ");
            System.out.println("------------------------------- ");
            int chuva = entrada.nextInt();
                if(chuva == 1){
                    System.out.println("Use um guarda-chuva, mas não perca hein?");
                } else if(chuva == 2){
                    System.out.println("Saia um pouco, vá sentir o sol no rosto! ");
                } else{
                    System.out.println("Você digitou a opção inválida! ");
                }
        } else if (celsius >= 10 && celsius < 15) {
            System.out.println("Não está melhorando, mas já esteve pior! ");
            System.out.println("-------------------------------");
            System.out.println("Informe uma condição do clima: ");
            System.out.println("1. Está chovendo");
            System.out.println("2. Está Ensolarado");
            System.out.println("Escolha a opção: ");
            System.out.println("------------------------------- ");
            int chuva = entrada.nextInt();
                if(chuva == 1){
                    System.out.println("Já esteve pior! Use o guarda-chuva!");
                } else if(chuva == 2){
                    System.out.println("Sol, porém ainda nada de praia. ");
                } else{
                    System.out.println("Você digitou a opção inválida! ");
                }
        } else if (celsius >= 15 && celsius < 25){
            System.out.println("Temperatura melhorando! Praia ainda é uma possibilidade? ");
            System.out.println("-------------------------------");
            System.out.println("Informe uma condição do clima: ");
            System.out.println("1. Está chovendo");
            System.out.println("2. Está Ensolarado");
            System.out.println("Escolha a opção: ");
            System.out.println("------------------------------- ");
            int chuva = entrada.nextInt();
                if(chuva == 1){
                    System.out.println("Levar um guarda-chuva!");
                } else if(chuva == 2){
                    System.out.println("Ensolarado? Agora acredito na praia! ");
                } else{
                    System.out.println("Você digitou a opção inválida! ");
                }
        } else if (celsius >= 25 && celsius <= 40) {
            System.out.println("Esta temperatura... Que saudades do Frio! Contudo, bora praia!");
            System.out.println("-------------------------------");
            System.out.println("Informe uma condição do clima: ");
            System.out.println("1. Está chovendo");
            System.out.println("2. Está Ensolarado");
            System.out.println("Escolha a opção: ");
            System.out.println("------------------------------- ");
            int chuva = entrada.nextInt();
                if(chuva == 1){
                    System.out.println("Pense podia ser pior! Podia estar mais frio!");
                } else if(chuva == 2){
                    System.out.println("Bora Praia! ");
                } else{
                    System.out.println("Você digitou a opção inválida! ");
                }
        } else {
            System.out.println("Temperatura incorreta");
        }
    }

}
