/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio;

/**
 *
 * @author VEL-USER
 */
public class calcularpromedio {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double suma;
    private double promedio;
    
    public calcularpromedio(){
        nombre = "Mochix Ortix";
        nota1 = 10;
        nota2 = 0;
        nota3= 5;
    }
    
    public calcularpromedio(String n, int n1, int n2, int n3 ){
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3= n3;
    }
    
}
