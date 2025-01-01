/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author XYLO
 */
public class Matematika {
    
    int tambah;
    int kurang;
    int kali;
    int bagi;
    double tambahTambah;
    double kurangKurang;
    double kaliKali;
    double bagiBagi;
    
    void setPertambahan (int a, int b){
        tambah = a + b;
    }
    
    void setPertambahan (int a, int b, int c){
        tambah = a + b + c;
    }
     
    void setPertambahan (double a, double b){
        tambahTambah = a + b;
    }
    
    void setPertambahan (double a, double b, double c){
        tambahTambah = a + b +c;
    }
    
    void setPengurangan (int a, int b){
        kurang = a - b;
    }
    
    void setPengurangan (int a, int b, int c){
        kurang = a - b - c;
    }
    
    void setPengurangan (double a, double b) {
        kurangKurang = a - b;
    }
    
    void setPengurangan (double a, double b, double c){
        kurangKurang = a - b - c;
    }
    
    void setPerkalian (int a, int b){
        kali = a * b;
    }
    
    void setPerkalian (int a, int b, int c){
        kali = a * b * c;
    }
    
    void setPerkalian (double a, double b){
        kaliKali = a * b;
    }
    
    void setPerkalian (double a, double b, double c){
        kaliKali = a * b * c;
    }
     
    void setPembagian (int a, int b){
         bagi = a / b;
     }
     
    void setPembagian (int a, int b, int c){
         bagi = a / b / c;
     }
     
    void setPembagian (double a, double b){
         bagiBagi= a / b;
     }
    
    void setPembagian (double a, double b, double c){
         bagiBagi= a / b / c;
     }
    
    
    
    int getPertambahan(){
        return tambah;
    }
    
    double getTambahTambah(){
        return tambahTambah;
    }
    
    int getPengurangan(){
        return kurang;
    }
    
    double getKurangKurang(){
        return kurangKurang;
    }
    
    int getPerkalian(){
        return kali;
    }
    
    double getKaliKali(){
        return kaliKali;
    }
    
    int getPembagian(){
        return bagi;
    }
    
    double getBagiBagi(){
        return bagiBagi;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
