package edu.paulo.java.anatomia_de_classes;
public class BoletimEstundantil {
    public static void main(String[] args){
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }    
}
