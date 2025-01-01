/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author Xylo
 */
public class Bank {
    int saldo;
    public Bank (int saldo){
        
        this.saldo = saldo;
    }
    void getSaldo (int saldo){
        System.out.println("Selamat Datang");
        System.out.println("Saldo saat ini = " + saldo);
    }
    void simpanUang (int simpanUang){
        saldo += simpanUang;
        System.out.println("simpan uang = " + simpanUang);
        System.out.println("saldo saat ini = " + saldo);
        
    }
    void ambilUang (int ambilUang){
        saldo -= ambilUang;
        System.out.println("ambil uang = " + ambilUang);
        System.out.println("sado saat ini = " + saldo);
    }
}
