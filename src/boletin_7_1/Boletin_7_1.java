/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_1;
import javax.swing.JOptionPane;
public class Boletin_7_1 {
    public static void main(String[] args) {
        String respuesta = JOptionPane.showInputDialog("Introduce un numero");
        double b = Double.parseDouble(respuesta);
        Numero pos = new Numero();
        pos.setNum(b);
        pos.positivo();
    }
}
