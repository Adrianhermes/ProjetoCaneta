package com.mycompany.projetocaneta;

import javax.swing.JOptionPane;

//Classe
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //Metodos
    
    public void status(){
        JOptionPane.showMessageDialog(null,"SOBRE A CANETA");
        JOptionPane.showMessageDialog(null,"Modelo " + this.getModelo());
        JOptionPane.showMessageDialog(null,"Ponta " + this.getPonta());
        JOptionPane.showMessageDialog(null,"Cor " + this.getCor());
        JOptionPane.showMessageDialog(null,"Tampada " + this.tampada);
    }

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }
    
    public String getModelo() { 
        return this.modelo;
    } 

    public void setModelo(String modelo) { 
        this.modelo = modelo;
    }
    
    public float getPonta() { 
        return this.ponta;
    }
    
    public void setPonta(float ponta) { 
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
 
}
