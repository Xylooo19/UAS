/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author XYLO
 */
public class HandphoneBeraksi {
     public static void main(String[] args) {
        Hp hpKu = new Hp();
        hpKu.hidupkan = "Hidup";
        hpKu.kirimSMS = "Mengirim SMS";
        hpKu.lakukanPanggilan = "Melakukan Panggilan";
        hpKu.matikan = "Mati";
        hpKu.pintHandphoneKu();

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        Hp hpTeman = new Hp();
        hpTeman.hidupkan = "Gagal Hidup";
        hpTeman.kirimSMS = "Tidak Dapat Mengirim SMS";
        hpTeman.lakukanPanggilan = "Tidak Dapat Melakukan Panggilan";
        hpTeman.matikan = "Tetap Mati";
        hpTeman.pintHandphoneTeman();
    
}
}
