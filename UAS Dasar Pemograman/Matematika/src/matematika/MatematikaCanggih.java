/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author XYLO
 */
public class MatematikaCanggih extends Matematika{
    private int modulus;
    private double modulusModulus;
    
    
    void setModulus (int a, int b){
        modulus = a % b;
    }
    
    void setModulus (int a, int b, int c){
        modulus = (a % b) % c;
    }
    
    void setModulus (double a, double b){
        modulusModulus = a % b;
    }
    
    void setModulus (double a, double b, double c){
        modulusModulus = (a % b) % c;
    }
    
    
    
    int getModulus (){
        return modulus;
    }
    
    double getModulusModulus(){
        return modulusModulus;
    }
    
    
}
