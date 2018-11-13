package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Rectangulo {
    private float base;
    private float altura;
    
    public float calculoArea(){
        boolean correcto = false;
        do{
            float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la base del rectangulo : "));
            if (num1 > 0){
                base = num1;
                correcto = true;
            }
            else{
             JOptionPane.showMessageDialog(null,"Numero no valido. Vuelva a introducir el numero : ");   
        }
        }while(correcto == false);
        correcto = false;
        
        do{
            float num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura del rectangulo : "));
            if (num2 > 0){
                altura = num2;
                correcto = true;
            }
            else{
                JOptionPane.showMessageDialog(null,"Numero no valido. Vuelva a introducir el numero : ");
            }
        }while(correcto == false);
        return base*altura;
    }
}
