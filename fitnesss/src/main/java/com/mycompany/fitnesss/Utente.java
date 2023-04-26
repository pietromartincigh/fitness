/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesss;

/**
 *
 * @author Utente
 */
public class Utente {
    
    private String nome;
    private double kg;
    private double cm;
    private int lv_attivita;
    
    private int calorie;
    private int calorie_giornaliere = calorie;
    
    public Utente(){
        
    }
    
    public Utente(String nome, double kg, double cm, int lv_attivita){
        
        this.nome = nome;
        this.kg = kg;
        this.cm = cm;
        this.lv_attivita = lv_attivita;
        
        //calcoli vari
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
        //calcoli
    }

    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
        //calcoli
    }

    public int getLv_attivita() {
        return lv_attivita;
    }

    public void setLv_attivita(int lv_attivita) {
        this.lv_attivita = lv_attivita;
        //calcoli
    }
    
    
    public void scalaCibo(Cibo cibo, int gr) throws Exception{
    
        if(calorie_giornaliere <= 0)
            throw new Exception("Calorie massime già raggiunte");
        
        int temp_cal = cibo.getKcal()*(gr/100);
        
        if(calorie_giornaliere - temp_cal <= 0)
            throw new Exception("Superi limite calorie");
        
        else
            calorie_giornaliere-=temp_cal;
    }
    
    
}
