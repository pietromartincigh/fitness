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
    private String password;
    
    private double kg;
    private double cm;
    private int eta;
    private double lv_attivita; //quantità di attività fisica fatta al giorno
    private int metabolismo_basale;
    private int obiettivo; // calorie da aggiungere/togliere in base all'obiettivo prefissato (mantenimento, massa, definizione ecc)
    
    private int normocalorie; //calorie che l'utente consuma di base giornarlmente
    private int calorie; // obiettivo giornaliero calorie
    private int calorie_giornaliere = calorie; //calorie ancora da consumare per raggiungere obiettivo giornaliero
    
    public Utente(){
        
    }
    
    public Utente(String nome, double kg, double cm, double lv_attivita, int eta, int obiettivo){
        
        this.nome = nome;
        this.kg = kg;
        this.cm = cm;
        this.lv_attivita = lv_attivita;
        this.eta = eta;
        this.obiettivo = obiettivo;
        
        calcoloNormocalorie();
        //calcoli vari
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getLv_attivita() {
        return lv_attivita;
    }

    public void setLv_attivita(double lv_attivita) {
        this.lv_attivita = lv_attivita;
    }
    
    public int getMetabolismo_basale(){ //Get metabolismo basale
        return metabolismo_basale;
    }
    
    public void setMetabolismo_basale(int metabolismo_basale){
        this.metabolismo_basale = metabolismo_basale;
        
        allCalcoli();
        //calcoli
    }
    
    public void setObiettivo(int obiettivo){ 
        this.obiettivo = obiettivo;
    }

    public int getNormocalorie() { //get di calorie normocalorie (mantenimento)
        return normocalorie;
    }

    public int getCalorie() { //get calorie obbiettivo giornaliero
        return calorie;
    }

    public int getCalorie_giornaliere() { //calorie da condumare ancora per raggiungere obiettivo giornaliero
        return calorie_giornaliere;
    }

    
    private void calcoloNormocalorie(){
        this.normocalorie = (int)(metabolismo_basale * lv_attivita);
    }
    
    private void calcoloCalorie(){
        this.calorie = normocalorie + obiettivo;
    }
    
    public void allCalcoli(){
        
        calcoloNormocalorie();
        calcoloCalorie();
    }
    
    
    
    
    public Boolean controlloPassword(String password_ins){        
        return password.equals(password_ins);
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
