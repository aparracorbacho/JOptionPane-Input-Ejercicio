/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane.input;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author aparracorbacho
 */
public class JOptionPaneInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float area, baseC, alturaC;
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "Vamos a calcular el area de un triangulo");
        String base; 
        base = JOptionPane.showInputDialog("Introduce la base");
        String altura; 
        altura = JOptionPane.showInputDialog("Introduce la altura");
        baseC = Float.parseFloat(base);
        alturaC = Float.parseFloat(altura);
        area = ((baseC*alturaC)/2);
        JOptionPane.showMessageDialog(frame, "El area es "+area);
    }
    
}
