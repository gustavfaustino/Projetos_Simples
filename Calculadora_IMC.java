import javax.swing.JOptionPane;

/**
 * Calculadora_IMC
 */
public class Calculadora_IMC {
    // 
    public static String IMCStatus(float imc){
        if(imc<18.5){
            return "Abaixo do peso";
        }
        else if(imc<24.9){
            return "Peso normal";
        }
        else if(imc<29.9){
            return "Acima do peso";
        }
        else if(imc<34.9){
            return "Obesidade Grau I";
        }
        else if(imc<39.9){
            return "Obesidade Grau II";
        }
        else{
            return "Obesidade Grau III";
        }
    }
    // Calculo do IMC 
    public static float IMC_Calc(float peso, float altura){
        float IMC_Calc = peso/(altura*altura) ;
        return IMC_Calc;
    }
    public static void main(String[] args) {
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, 
        "Bem vindo a Calculadora de IMC:\nPor favor, digite seu peso em kg:"));

        float altura = Float.parseFloat(JOptionPane.showInputDialog(null,
        "Agora, digite sua altura em m (metros):"));
        
        float imc = IMC_Calc(peso, altura);

        JOptionPane.showMessageDialog(null, IMCStatus(imc));
    }
    
}