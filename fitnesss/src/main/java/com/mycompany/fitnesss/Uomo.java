/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesss;

/**
 *
 * @author Utente
 */
public class Uomo extends Utente{
    
    public Uomo(){
        super();
    }
    
    public Uomo(String nome, double kg, double cm, double lv_attivita, int eta, int obiettivo){
        
        super(nome, kg, cm, lv_attivita, eta, obiettivo);       
        calcoloMetabolismo_basale();
    }
    
    
    public double getKg(){
        return super.getKg();
    }
    
    public void setKg(double kg) {
        super.setKg(kg);
        calcoloMetabolismo_basale();
        super.allCalcoli();
    }
    
    public double getCm(){
        return super.getCm();
    }

    public void setCm(double cm) {
        super.setCm(cm);
        calcoloMetabolismo_basale();
        super.allCalcoli();
    }
    
    public int getEta(){
        return super.getEta();
    }

    public void setEta(int eta) {
        super.setEta(eta);
        calcoloMetabolismo_basale();
        super.allCalcoli();
    }
    
    public double getLv_attivita(){
        return super.getLv_attivita();
    }

    public void setLv_attivita(double lv_attivita) {
        super.setLv_attivita(lv_attivita);
        calcoloMetabolismo_basale();
        super.allCalcoli();
    }
    
    
    public int getCalorie(){
        return super.getCalorie();
    }
    
    public int getNormocalorie(){
        return super.getNormocalorie();
    }

    public int getMetabolismo_basale(){
        return super.getMetabolismo_basale();
    }
    
    public void calcoloMetabolismo_basale(){
        
        super.setMetabolismo_basale((int)(66.47 + (13.75 * super.getKg()) + (5 * super.getCm()) - (6.75*super.getEta())));
    }
    
    
}
