package com.travdir;

public class AccountTest {
    public static void main(String[] args) {
        Customer André = new Customer("Andry","Nirina","0344432444","andry@gmail.com","10 Aout 1980");
        Customer Celestin = new Customer("Rakoto","Arimanana","0342345009","cele@gmail.com","21 Fevrier 1990");
        Customer Fra = new Customer("Randrema","François","0320100302","franc@gmail.com","30 decembre 1999");
        account premier = new account(22,André,2000_000);
        account deusieme = new account(30,Celestin,1_500_000);
        account troisieme = new account(12,Fra,10_000_000);
        account quatrieme = new account(11,Fra,0);

        //tetst methodes:
        premier.credit(100_000);
        System.out.println("il reste "+premier.solde+" Ariary sur le compte premier");
        deusieme.debit(500_000);
        System.out.println("il reste "+deusieme.solde+" Ariary sur le compte deusieme");
        troisieme.transferToAccount(premier,1000_000);
        System.out.println("Votre nouveau solde est "+troisieme.solde);
        quatrieme.debit(10_000);

    }
}
