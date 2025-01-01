/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac;

/**
 *
 * @author Xylo
 */
public class AC implements InterfaceAC {
    int statusAC;
    String modeAC = "Normal";
    
    public void hidupkanAC(){
        if (statusAC == KEADAAN_OFF){
            statusAC = KEADAAN_ON;
            System.out.println("Hidupkan AC --> AC ON");
        } else {
            System.out.println("Hidupkan AC --> AC Sudah ON");
        }
    }
    
     public void matikanAC(){
        if (statusAC == KEADAAN_OFF) {
            statusAC = KEADAAN_ON;
            modeAC = "Normal";
            System.out.println("Matikan AC --> AC OFF , Mode diatur kembali ke 'Normal'");
        } else {
            System.out.println("Matikan AC --> AC Sudah off");
        }
    }
    
    
    public void dinginkanAC(){
        if (statusAC == KEADAAN_OFF) {
            modeAC = "Dingin";
            System.out.println("Atur mode AC --> Mode Dingin");
        } else {
            System.out.println("Atur Mode AC --Hidupkan AC Terlebih Dahulu");
        }
    }
    
    public void panaskanAC () {
        if (statusAC == KEADAAN_ON) {
            modeAC = "Panas";
            System.out.println("Atur Mode AC --> Mode Panas");
        } else {
            System.out.println("Atur Mode AC --> Hidupkan AC Terlebih Dahulu");
        }
    }
    public void tampilkanStatus() {
        String status = (statusAC == KEADAAN_ON) ? "Hidup" : "Mati";
        System.out.println("Status AC  -->  " + status);
        System.out.println("Mode AC  -->  " + modeAC);
    }
}
