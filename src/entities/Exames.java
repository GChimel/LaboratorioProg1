package entities;

import javax.swing.*;

public class Exames {
    protected String nome;
    protected String tipoSanguineo;
    protected Integer anoNascimento;

    public Exames() {

    }
    public Exames(String nome, String tipoSanguineo, Integer anoNascimento) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public void exame() {
        nome = (JOptionPane.showInputDialog("Nome do paciente: "));
        anoNascimento = (Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: ")));
        tipoSanguineo = (JOptionPane.showInputDialog("Tipo sanguineo: "));
    }
}