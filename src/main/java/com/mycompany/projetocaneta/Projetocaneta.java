package com.mycompany.projetocaneta;

import javax.swing.JOptionPane;

public class Projetocaneta {

    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null,"Vou apresentar a Primeira Caneta");
       Caneta c1 = new Caneta();
       c1.modelo = "BIC";
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.carga = 70;
       c1.destampar();
       c1.status();
       c1.rabiscar();
       
       JOptionPane.showMessageDialog(null,"Vou apresentar a Segunda Caneta");
       Caneta c2 = new Caneta();
       c2.modelo = "Faber Castel";
       c2.cor = "Vermelha";
       c2.ponta = 1.0f;
       c2.carga = 20;
       c2.tampar();
       c2.status();
       c2.rabiscar();
       
    }
}
