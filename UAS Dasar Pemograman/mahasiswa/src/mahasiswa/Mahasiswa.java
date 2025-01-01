/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Xylo
 */
public class Mahasiswa {
    String membaca, nugas, kelas, lulus;
    Double ipk;
    int semester;
    
    void printMahasiswa(){
        System.out.println("Mahasiswa Semester " + semester  + " Membaca " + membaca);
        System.out.println("Mahasiswa Semester " + semester  + " Nugas " + nugas);
        System.out.println("Mahasiswa Semester " + semester  + " Masuk Kelas " + kelas );
        System.out.println("Mahasiswa Semester " + semester  + " Hasil " + lulus);
    }
    
}
