/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author XYLO
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih MAT = new MatematikaCanggih();
        
        MAT.setPertambahan(10, 11);
        System.out.println("Hasil dari Pertambahan A + B " + MAT.getPertambahan());
        
        MAT.setPertambahan(24, 23, 11);
        System.out.println("Hasil dari Pertambahan A + B + C " + MAT.getPertambahan());
        
        MAT.setPertambahan(2.7, 3.4);
        System.out.println("Hasil dari Pertambahan A + B " + MAT.getTambahTambah());
        
        MAT.setPertambahan(4.4, 1.6, 9.1);
        System.out.println("Hasil dari Pertambahan A + B + C " + String.format("%.2f",MAT.getTambahTambah()));
        
        MAT.setPengurangan(20, 10);
        System.out.println("Hasil dari Pengurangan (2 int ) " + MAT.getPengurangan());
        
        MAT.setPengurangan(11, 4, 2);
        System.out.println("Hasil dari Pengurangan (3 int ) " + MAT.getPengurangan());
        
        MAT.setPengurangan(22.6, 17.3);
        System.out.println("Hasil dari Pengurangan (2 double) " + String.format("%.2f",MAT.getKurangKurang()));
        
        MAT.setPengurangan(33.2, 22.8, 5.6);
        System.out.println("Hasil dari Pengurangan (3 double) " + String.format("%.2f",MAT.getKurangKurang()));
        
        MAT.setPerkalian(5, 4);
        System.out.println("Hasil dari Perkalian (2 int ) " + MAT.getPerkalian());
        
        MAT.setPerkalian(10, 2, 4);
        System.out.println("Hasil dari Perkalian (3 int ) " + MAT.getPerkalian());
        
        MAT.setPerkalian(4.5, 5.2);
        System.out.println("Hasil dari Perkalian (2 double ) " + String.format("%.2f",MAT.getKaliKali()));
        
        MAT.setPerkalian(11.2, 3.2,3.5);
        System.out.println("Hasil dari Perkalian (3 double ) " + String.format("%.2f",MAT.getKaliKali()));
        
        MAT.setPembagian(16, 4);
        System.out.println("Hasil dari Pembagian (2 int ) " + MAT.getPembagian());
        
        MAT.setPembagian(2000, 20, 4);
        System.out.println("Hasil dari Pembagian (3 int ) " + MAT.getPembagian());
        
        MAT.setPembagian(22.3, 5,4);
        System.out.println("Hasil dari Pembagian (2 double) " + MAT.getBagiBagi());
        
        MAT.setPembagian(33.5, 3.4, 4.5);
        System.out.println("Hasil dari Pembagian (3 double) " + String.format("%.2f",MAT.getBagiBagi()));
        
        MAT.setModulus(23, 34);
        System.out.println("Hasil dari Pembagian (2 int ) " + MAT.getModulus());
        
        MAT.setModulus(12, 28, 14);
        System.out.println("Hasil dari Pembagian (3 int ) " + MAT.getModulus());
        
        MAT.setModulus(3.4, 4.9);
        System.out.println("Hasil dari Pembagian (2 double ) " + MAT.getModulusModulus());
        
        MAT.setModulus(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pembagian (3 double) " + String.format("%.2f",MAT.getModulusModulus()));
        
    }
    
}
