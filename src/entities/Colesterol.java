package entities;

import javax.swing.*;

public class Colesterol extends Exames{
    private Integer qtdLdl;
    private Integer qtdHdl;
    private String risco;

    @Override
    public void exame() {
        nome = (JOptionPane.showInputDialog("Nome do paciente: "));
        anoNascimento = (Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: ")));
        tipoSanguineo = (JOptionPane.showInputDialog("Tipo sanguineo: "));
        qtdHdl = (Integer.parseInt(JOptionPane.showInputDialog("Quantidade HDL: ")));
        qtdLdl = (Integer.parseInt(JOptionPane.showInputDialog("Quantidade LDL: ")));
        risco = JOptionPane.showInputDialog("Risco (B - baixo, M - medio e A - alto)");

        String resultadoHdl = "";
        String resultadoLdl = "";

        int idade = 2023 - anoNascimento;

        if ((idade < 19 && qtdHdl > 45) || (idade > 20 && qtdHdl > 40)){
            resultadoHdl = "Bom";
        } else {
            resultadoHdl = "Ruim";
        }

        switch (risco) {
            case "B":
                if (qtdLdl < 100) {
                    resultadoLdl = "Bom";
                }
                break;
            case "M":
                if (qtdLdl < 70) {
                    resultadoLdl = "Bom";
                }
                break;
            case "A":
                if (qtdLdl < 50) {
                    resultadoLdl = "Bom";
                }
                break;
            default:
                resultadoLdl = "Ruim";
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                "\nTipo sanguineo: " + tipoSanguineo +
                "\nQuantidade HDL: " + qtdHdl +
                "\nQuantidade LDL: " + qtdLdl +
                "\nClassificação HDL: " + resultadoHdl +
                "\nClassificação LDL: " + resultadoLdl );
    }
}