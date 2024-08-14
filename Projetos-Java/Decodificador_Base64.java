import javax.swing.*;
import java.util.Base64;
/* Programa extremamente simples para decodificar
 * e codificar códigos em base 64 utilizando a biblioteca
 * Base64.
 */
public class Decodificador_Base64 {
    public static void main(String[] args) {
        // Decodificar:
        String decInput = "";
       String decOutput = "";
        // Codificar
        String codInput = "";
        String codOutput = "";
        // Opções
        String[] Options = {"Decodificar", "Codificar"};
        // Saída
        int saida;

                                        /* Funcionamente do código */
        do {
            int choice = JOptionPane.showOptionDialog(null,
                    "Bem-vindo(a) ao decodificador e codificador de Base64\n" +
                            "Com o que deseja prosseguir?",
                    "Base64", 0, 3, null, Options, null);

                                        /* Decodificação */
            if (choice == 0) {
                decInput = JOptionPane.showInputDialog(null,
                        "Qual código deseja Decodificar?:", "Base64", JOptionPane.INFORMATION_MESSAGE);
                byte[] decodedBytes = Base64.getDecoder().decode(decInput.getBytes());
                decOutput = new String(decodedBytes);

                JTextArea tDec = new JTextArea(5, 50);
                tDec.setText(decOutput);
                JOptionPane.showMessageDialog(null, new JScrollPane(tDec), "Resultado", JOptionPane.INFORMATION_MESSAGE);

                                        /* Codificação */
            } else if (choice == 1) {
                codInput = JOptionPane.showInputDialog(null,
                        "Qual código deseja Codificar?:", "Base64", JOptionPane.INFORMATION_MESSAGE);
                codOutput = Base64.getEncoder().encodeToString(codInput.getBytes());

                JTextArea tCod = new JTextArea(5, 50);
                tCod.setText(codOutput);
                JOptionPane.showMessageDialog(null, new JScrollPane(tCod), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
                                        /* Saída */
            saida = JOptionPane.showConfirmDialog(null,
                    "Deseja usar novamente?", "Base64", JOptionPane.YES_NO_OPTION);

        }while(saida == 0);
}}
