package edu.paulo.java.anatomia_de_classes;
public class MinhaClasse { //classe principal

    public static void main(String[] args) { //classe de execução 

        String primeiroNome = "Paulo";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
