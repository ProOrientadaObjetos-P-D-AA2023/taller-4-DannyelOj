/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sueldototal;

/**
 *
 * @author VEL-USER
 */
public class sueldototal {
    private String nombre; 
    private String apellido; 
    private double sueldoBásico;
    private double sueldoTotal;
    private String cedula;
    
    public sueldototal(){
        nombre = "Mochix"; 
        apellido = "Ortiz"; 
        sueldoBásico = 100;
        cedula = "1150297988";
    }
    
    public sueldototal(String n,String a,double sB,  String cI ){
        nombre = n; 
        apellido = a; 
        sueldoBásico = sB;
        cedula = cI;
    }
    
}
