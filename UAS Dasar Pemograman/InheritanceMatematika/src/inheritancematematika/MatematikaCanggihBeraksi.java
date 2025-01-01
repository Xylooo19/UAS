/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancematematika;

/**
 *
 * @author Xylo
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();

        mtk.setPertambahan(23, 34);
        System.out.println("Hasil dari Pertambahan = " + mtk.getOperasi());

        mtk.setPengurangan(92, 25);
        System.out.println("Hasil dari Pengurangan = " + mtk.getOperasi());

        mtk.setPerkalian(10, 3);
        System.out.println("Hasil dari Perkalian   = " + mtk.getOperasi());

        mtk.setPembagian(24, 6);
        System.out.println("Hasil dari Pembagian   = " + mtk.getOperasi());

        mtk.setModulus(10, 3);
        System.out.println("Hasil dari Modulus     = " + mtk.getModulus());
    }
}
