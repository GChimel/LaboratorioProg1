
package entities;

import javax.swing.JOptionPane;

public class Glicemia extends Exames{
    private Integer qtdGlicose;
    @Override
    public void exame() {
        nome = (JOptionPane.showInputDialog("Nome do paciente: "));
        anoNascimento = (Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: ")));
        tipoSanguineo = (JOptionPane.showInputDialog("Tipo sanguineo: "));
        qtdGlicose = Integer.parseInt(JOptionPane.showInputDialog("Glicose: "));

        String resultado = "";

        if (qtdGlicose < 100) {
            resultado = "Normoglicemia";
        } else if (qtdGlicose < 126) {
            resultado = "Pré-Diabetes";
        } else {
            resultado = "Diabetes estabelecido";
        }
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                    "\nTipo sanguineo: " + tipoSanguineo +
                    "\nResultado: " + qtdGlicose +
                    "\nClassificação: " + resultado);
    }
}