package entities;

import javax.swing.JOptionPane;

public class Triglicerideos extends Exames {
    private Integer qtdTriglicerideos;

    @Override
    public void exame() {

        nome = (JOptionPane.showInputDialog("Nome do paciente: "));
        anoNascimento = (Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: ")));
        tipoSanguineo = (JOptionPane.showInputDialog("Tipo sanguineo: "));
        qtdTriglicerideos = (Integer.parseInt(JOptionPane.showInputDialog("Quantidade Triglicerideos ")));

        int idade = 2023 - anoNascimento;

        if ((idade < 9 && qtdTriglicerideos < 75) ||
            (idade < 19 && qtdTriglicerideos < 90) ||
            (idade <= 20 && qtdTriglicerideos < 150)) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome +
                    "\nTipo sanguineo: " + tipoSanguineo +
                    "\nResultado: " + qtdTriglicerideos +
                    "\nClassificação: " + "Bom");
        } else {
            JOptionPane.showMessageDialog(null, "Nome: " + nome +
                    "\nTipo sanguineo: " + tipoSanguineo +
                    "\nResultado: " + qtdTriglicerideos +
                    "\nClassificação: " + "Ruim");
        }
    }
}
