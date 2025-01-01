/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Xylo
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswaBaru = new Mahasiswa();
        mahasiswaBaru.semester = 1;
        mahasiswaBaru.membaca = "Buku Dasar Pemograman";
        mahasiswaBaru.nugas = "Menyelesaikan Tugas Dasar Pemograman";
        mahasiswaBaru.ipk = 3.7;
        mahasiswaBaru.lulus = "lulus";
        mahasiswaBaru.printMahasiswa();
        
    }
    
}
