/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Xylo
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        bank.getSaldo(10000);
        bank.simpanUang(50000);
        bank.ambilUang(20000);
        
    }
    
}
