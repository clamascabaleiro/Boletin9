package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Sueldos {
    public void lecturaSueldos(){
        double soldo; 
        int contadorTrabajadores = 0;
        int contadorSueldos_1 = 0;
        int contadorSueldos_2 = 0;
        do{
            soldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo de un empleado:"));
            if(soldo > 0){
                contadorTrabajadores++;
            }
            if(soldo >= 1000 && soldo <= 1750){
                contadorSueldos_1++;
            }
            else if(soldo < 1000 && soldo > 0){
                contadorSueldos_2++;
            }
        }while(soldo != 0);
        JOptionPane.showMessageDialog(null, "Número de trabajadores que ganan entre 1000 y 1750€: " 
                + contadorSueldos_1 + "\nPorcentaje de trabajadores que ganan menos de 1000€: " 
                + (contadorSueldos_2*100/contadorTrabajadores) + "%");
    }
}
