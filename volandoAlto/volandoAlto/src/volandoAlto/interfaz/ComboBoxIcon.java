/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volandoAlto.interfaz;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class ComboBoxIcon extends JFrame {

    JComboBox comboBox;

    public ComboBoxIcon() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/volandoAlto/interfaz/France.png")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        Object[] items
                = {
                    imageIcon,
                    imageIcon,
                    imageIcon,
                    imageIcon,
                    imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,imageIcon,
                    new ImageIcon(getClass().getResource("/volandoAlto/interfaz/Italy.png"))

                };
        comboBox = new JComboBox(items);
        comboBox.setAlignmentY(CENTER_ALIGNMENT);
        comboBox.setAlignmentX(CENTER_ALIGNMENT);
        getContentPane().add(comboBox, BorderLayout.NORTH);
    }

//    public static void main(String[] args) {
//        JFrame frame = new ComboBoxIcon();
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
}
