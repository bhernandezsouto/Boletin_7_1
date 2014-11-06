/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_1;
import javax.swing.JOptionPane;
public class Numero {
    private double num;
    public double getNum() {
        return num;
    }
    public void setNum(double num) {
        this.num = num;
    }
    public void positivo(){
        if (num > 0){
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        }
        else
            JOptionPane.showMessageDialog(null, "El numero es 0 o es negativo vuelva a intentar");
    }
    
}
