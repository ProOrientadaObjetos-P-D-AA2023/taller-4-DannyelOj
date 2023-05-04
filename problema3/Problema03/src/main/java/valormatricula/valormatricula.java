/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valormatricula;

/**
 *
 * @author VEL-USER
 */
public class valormatricula {
    private String cédulaDueño; 
    private String marcaVehículo; 
    private String añoFabricación; 
    private double valorVehículo;
    private double valorMatricula;
    
    public valormatricula(){
        cédulaDueño = "1234567890";
        marcaVehículo = "perrix";
        añoFabricación = "2002";
        valorVehículo = 13000;
        valorMatricula = 200;
    }
    
    public valormatricula(String c, String m, String a, double v, double vM){
        cédulaDueño = c;
        marcaVehículo = m;
        añoFabricación = a;
        valorVehículo = v;
        valorMatricula = vM;
    }
    
}
