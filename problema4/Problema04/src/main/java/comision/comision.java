/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comision;

/**
 *
 * @author VEL-USER
 */
public class comision {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisiónBanco;
    
    public comision(){
        nombreCliente = "Mochix Orix";
        nombreBanco = "moci Cia. Ltda.";
        valorCheque = 2000;
        comisiónBanco = 20;
    }
    
    public comision(String n, String nB, double v, double c){
        nombreCliente = n;
        nombreBanco = nB;
        valorCheque = v;
        comisiónBanco = c;
    }
    
}
