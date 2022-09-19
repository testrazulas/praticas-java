package Praticas.POO.classes;

public class InfoGatos {

    public static String user = "";

    private static String _desenvolvedor = "GatosDevOpS - Desenvolvedor";

    private static String _versao = "Versão Documento - 1.0.0";

    public static String getDesenvolvedor(){
        return _desenvolvedor;

    }

    public static String getVersao(){
        return _versao;
    }

    public static String setVersao(String versao){
        if(user.equals(_desenvolvedor)){
           return _versao = versao;
        }
        return versao = "Usuário novo: Versão Documento(1.0.0)";
    }
}
