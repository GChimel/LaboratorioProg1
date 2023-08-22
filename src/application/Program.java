package application;

import javax.swing.*;
import entities.Colesterol;
import entities.Glicemia;
import entities.Triglicerideos;

public class Program {
     public static void main(String[] args) {

        Glicemia exameGlicemia = new Glicemia();
        Triglicerideos exameTriglicerideos = new Triglicerideos();
        Colesterol exameColesterol = new Colesterol();

        int x = Integer.parseInt(JOptionPane.showInputDialog("1- Exame de Glicemia" +
                "\n2- Exame de Triglicerideos" +
                "\n3- Exame de Colesterol"));

        switch (x) {
            case 1:
                exameGlicemia.exame();
                break;
            case 2:
                exameTriglicerideos.exame();
                break;
            default:
                exameColesterol.exame();
        }
    }
}
