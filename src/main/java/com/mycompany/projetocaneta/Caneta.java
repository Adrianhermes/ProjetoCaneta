package com.mycompany.projetocaneta;

import javax.swing.JOptionPane;

//Classe
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Metodos
    void status(){
        JOptionPane.showMessageDialog(null,"Seu modelo é " + this.modelo);
        JOptionPane.showMessageDialog(null,"Uma caneta de cor " + this.cor);
        JOptionPane.showMessageDialog(null,"O tamanho da sua ponta é " + this.ponta);
        JOptionPane.showMessageDialog(null,"Sua carga atual é de " + this.carga + "%");
        JOptionPane.showMessageDialog(null,"Esta tampada? " + this.tampada);
    } 
    
    void rabiscar(){
       if(this.tampada == true){
            JOptionPane.showMessageDialog(null,"ERRO!! A CANETA ESTÁ TAMPADA, NÃO PODE RABISCAR");
        }else{
            JOptionPane.showMessageDialog(null,"PODE RABISCAR!");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
