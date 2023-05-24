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
    private String cognome;
    private String username;
    private String password;
    
    private double kg;
    private int cm;
    private int eta;
    private double lv_attivita; //quantità di attività fisica fatta al giorno
    private int metabolismo_basale;
    private int obiettivo; // calorie da aggiungere/togliere in base all'obiettivo prefissato (mantenimento, massa, definizione ecc)
    
    private int normocalorie; //calorie che l'utente consuma di base giornarlmente
    private int calorie; // obiettivo giornaliero calorie
    private int calorie_giornaliere = calorie; //calorie ancora da consumare per raggiungere obiettivo giornaliero
    
    private int grassi;
    private int kcal_grassi;
    private int proteine;
    private int kcal_proteine;
    private int carboidrati;
    private int kcal_carbo;
    
    private int grassi_g = grassi;
    private int proteine_g = proteine;
    private int carboidrati_g = carboidrati;
    
    public Utente(){
        
    }
    
    public Utente(String nome, String cognome, String username, String password, double kg, int cm, double lv_attivita, int eta, int obiettivo){
        
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
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

    public int getGrassi() {
        return grassi;
    }

    public int getProteine() {
        return proteine;
    }

    public int getCarboidrati() {
        return carboidrati;
    }

    public void setGrassi(int grassi) {
        this.grassi = grassi;
    }

    public void setProteine(int proteine) {
        this.proteine = proteine;
    }

    public void setCarboidrati(int carboidrati) {
        this.carboidrati = carboidrati;
    }

    public int getKcal_grassi() {
        return kcal_grassi;
    }

    public void setKcal_grassi(int kcal_grassi) {
        this.kcal_grassi = kcal_grassi;
    }

    public int getKcal_proteine() {
        return kcal_proteine;
    }

    public void setKcal_proteine(int kcal_proteine) {
        this.kcal_proteine = kcal_proteine;
    }

    public int getKcal_carbo() {
        return kcal_carbo;
    }

    public void setKcal_carbo(int kcal_carbo) {
        this.kcal_carbo = kcal_carbo;
    }

    public int getGrassi_g() {
        return grassi_g;
    }

    public int getProteine_g() {
        return proteine_g;
    }

    public int getCarboidrati_g() {
        return carboidrati_g;
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

    
    
    
    
    
    public void scalaCibo(Cibo cibo, int g) throws Exception{
    
        if(calorie_giornaliere <= 0)
            throw new Exception("Calorie massime già raggiunte");
        
        int temp_cal = cibo.getKcal()*(g/100);
        int temp_grassi = cibo.getGrassi()*(g/100);
        int temp_proteine = cibo.getProteine()*(g/100);
        int temp_carbo = cibo.getCarboidrati()*(g/100);
        
        if(calorie_giornaliere - temp_cal <= 0)
            throw new Exception("Superi limite calorie");
        
        else{
            calorie_giornaliere-=temp_cal;
            grassi_g-=temp_grassi;
            proteine_g-=temp_proteine;
            carboidrati_g-=temp_carbo;
        } 
            
    }
    
    
}
