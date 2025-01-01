/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;

/**
 *
 * @author XYLO
 */
public class Matematika1Beraksi {
     public static void main(String[] args) {
        Matematika1 mtk = new Matematika1();

        mtk.setPertambahan(100, 34);
        System.out.println("Hasil dari Pertambahan = " + mtk.getOperasi());
        mtk.setPengurangan(50, 12);
        System.out.println("Hasil dari Pengurangan = " + mtk.getOperasi());
        mtk.setPerkalian(9, 5);
        System.out.println("Hasil dari Perkalian = " + mtk.getOperasi());
        mtk.setPembagian(20, 4);
        System.out.println("Hasil dari Pembagian = " + mtk.getOperasi());
    
}
}