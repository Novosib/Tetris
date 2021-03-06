/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.zgame.utils;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.Color;

/**
 * @author user
 */
public class NameVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = "";
        if (input instanceof JTextField) {
            JTextField tf = (JTextField) input;
            text = tf.getText().trim();
        }
        boolean matches = text.matches("^\\w{1,14}$");
        input.setBackground((matches) ? Color.white : Color.RED);
        return matches;
    }
}
