/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikaa;

/**
 *
 * @author Xylo
 */
public class Matematikaa {
    int operasi;

    void setPertambahan (int a, int b){
        operasi = a + b;
    }
    void setPengurangan(int a, int b){
        operasi = a - b;
    }
    void setPerkalian(int a, int b){
        operasi = a * b;
    }
    void setPembagian(int a, int b){
        operasi = a / b;
    }
    int getOperasi (){
        return operasi;
    }
}