package com.travdir;

public class account {
    public int numero;
    public Customer proprietaire;
    public double solde=0;

    public account(int numero, Customer proprietaire, double solde) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public Customer getProprietaire() {
        return proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProprietaire(Customer proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void credit(double amount){
        solde+=amount;
    }
    public void debit(double amount){
        if(this.solde > 0){
            if(this.solde > amount){
                solde -= amount;
            }
        }else{
            System.out.println("Entrer un montant valide!");
        }
    }
    public void transferToAccount(account target,double amount){
        if(this.solde > 0){
            if(solde > amount){
                solde -= amount;
                target.solde += amount;
            }
        }else {
            System.out.println("Entrer un montant valide !");
        }
    }
}
