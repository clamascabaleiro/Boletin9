package boletin9_2;

/**
 *
 * @author clamascabaleiro
 */
public class sumaProducto {
    public int suma(){
        int suma = 0;
        int contador = 10;
        for(int i = 10; i<90; i++){
            suma = suma + contador;
            contador ++;
        }
        return suma;
    }
    public double producto(){
        double producto = 1;
        int contador = 10;
        for(int i = 10; i<90; i++){
            producto = producto * contador;
            contador ++;
        }
        return producto;
    }
}
