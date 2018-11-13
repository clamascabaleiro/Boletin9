package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Calcular {
      public void Numeros(){
          double num;
          int contCeros = 0;
          int contPositivos = 0;
          int contNegativos = 0;
          for(int i = 0; i < 10; i++){
              num = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número:"));
              if(num > 0){
                  contPositivos++;
              }
              else if(num < 0){
                  contNegativos++;
              }
              else{
                  contCeros++;
              }
          }
          JOptionPane.showMessageDialog(null, "Números positivos: " 
               + contPositivos + "\nNúmeros negativos: " 
               + contNegativos + "\n Número de  ceros: " + contCeros);
      }
}
    
   
