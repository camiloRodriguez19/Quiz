/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author estudiante
 */
import java.util.EventListener;

import Vista.Vista;
import Modelo.Operacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {
    private Vista vista;
    private Operacion operacion;

    public Control() {
    }

    public Control(Vista vista, Operacion operacion) {
        super();
        this.vista = vista;
        this.operacion = operacion;
        actionListener(this);
    }
    
    public void actionListener(ActionListener controlador){
              vista.jButton1.addActionListener(controlador);
              vista.jButton2.addActionListener(controlador);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== "Convertir a Pesos")
            vista.jTextField2.setText(String.valueOf(operacion.convertirDolarpeso()));
            vista.jTextField1.setText("");
        if(e.getSource()=="Convertir a Dolares") 
            vista.jTextField2.setText(String.valueOf(operacion.convertirPesoDolar()));
            vista.jTextField1.setText("");
    }

    @Override
    public String toString() {
        return "Control{" + "vista=" + vista + ", operacion=" + operacion + '}';
    }
    
    
}
