/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaa;

/**
 *
 * @author Xylo
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();

        mtk.setPertambahan(30, 55);
        System.out.println("Hasil dari Pertambahan = " + mtk.getOperasi());

        mtk.setPengurangan(22, 11);
        System.out.println("Hasil dari Pengurangan = " + mtk.getOperasi());

        mtk.setPerkalian(6,6);
        System.out.println("Hasil dari Perkalian   = " + mtk.getOperasi());

        mtk.setPembagian(27, 9);
        System.out.println("Hasil dari Pembagian   = " + mtk.getOperasi());

        mtk.setModulus(15, 6);
        System.out.println("Hasil dari Modulus     = " + mtk.getModulus());
    }
    
}
