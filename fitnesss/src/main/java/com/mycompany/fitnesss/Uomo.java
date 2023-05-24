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
    
    public Uomo(String nome, String cognome, String username, String password, double kg, int cm, double lv_attivita, int eta, int obiettivo){
        
        super(nome, cognome, username, password,kg, cm, lv_attivita, eta, obiettivo);       
        calcoloMetabolismo_basale();
        calcoloMacro();
    }
    
    
    public double getKg(){
        return super.getKg();
    }
    
    public void setKg(double kg) {
        super.setKg(kg);
        calcoloMetabolismo_basale();
        super.allCalcoli();
    }
    
    public int getCm(){
        return super.getCm();
    }

    public void setCm(int cm) {
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
    
    public int getCalorieGiornaliere(){
        return super.getCalorie_giornaliere();
    }

    public int getMetabolismo_basale(){
        return super.getMetabolismo_basale();
    }
    
    public int getGrassi(){
        return super.getGrassi();
    }
    
    public int getProteine(){
        return super.getProteine();
    }
    
    public int getCarboidrati(){
        return super.getCarboidrati();
    }
    
    public void calcoloMetabolismo_basale(){
        
        super.setMetabolismo_basale((int)(66.47 + (13.75 * super.getKg()) + (5 * super.getCm()) - (6.75*super.getEta())));
    }
    
    public void calcoloMacro(){
        
        super.setGrassi((int)super.getKg()+9);
        super.setKcal_grassi(super.getGrassi()*9);
        
        super.setProteine((int)(super.getKg()*1.8));
        super.setKcal_proteine(super.getProteine()*4);
        
        super.setKcal_carbo(super.getCalorie()-super.getKcal_grassi()-super.getKcal_proteine());
        super.setCarboidrati(super.getKcal_carbo()/4);
    }
    
    
}
