/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;


/**
 *
 * @author sa
 */
public class Account {
    
    private int id;
    private double balance;
    
    public Account(){
        id=0;
        balance=100;   
    }
    public Account(int idNumber){
        id=idNumber; 
    }
     
    public void setId(int idNumber){
        id=idNumber;
    }
    public int getId(){
        return id; 
    }
    public void setBalance(double iniBalance){
        balance=iniBalance;
    }
    public double getBalance(){
        return balance;
    }
    
    public double withdraw(double amtWithdrew){
        
       balance -=amtWithdrew ;
       return balance;
        
    }
    public double deposit(double amtDeposited){
        
         balance +=amtDeposited; 
         return balance;
    }
    
    public void exit(){
        System.exit(0);
    }
    public String toString(){
        return "Your balance is "+ balance+"$";
    }
    
    
}
