

package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin9_2 {

 
    public static void main(String[] args) {
       sumaProducto num = new sumaProducto();
       
       JOptionPane.showMessageDialog(null, "La suma es : " + num.suma() + "\n El producto es : " + num.producto());
    }

}
