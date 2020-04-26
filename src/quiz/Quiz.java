/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author estudiante
 */

import Control.Control;
import Modelo.Operacion;
import Vista.Vista;

public class Quiz {

    public static void main(String[] args) {
        
        Vista v = new Vista();
        Operacion e = new Operacion();
        new Control (v,e);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
        
        
    }
    
}
