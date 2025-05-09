package com.mycompany.projetocaneta;

import javax.swing.JOptionPane;

public class Projetocaneta {

    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null,"Vou apresentar uma Caneta");
       Caneta c1 = new Caneta("BIC", 0.5f, "Azul" );
       c1.status();
       JOptionPane.showMessageDialog(null,"Tenho uma caneta "+ c1.getModelo() + " com um uma ponta " + c1.getPonta());
    }
}
