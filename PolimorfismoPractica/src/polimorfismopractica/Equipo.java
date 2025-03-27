/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismopractica;

import java.util.List;
import java.util.ArrayList;


public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;
    
    public Equipo(String nombreEquipo, String pais){
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }
    
    public String getNombreEquipo(){
        return nombreEquipo;
    }
    
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }
    
    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }
    
    public void añadirCiclista(Ciclista ciclista){
        ciclistas.add(ciclista);
    }
    
   public void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for (Ciclista C : ciclistas) {
            tiempoTotalEquipo += C.getTiempoAcumulado();
        }
    }
    
    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo + ", País: " + pais + ", Tiempo total: " + tiempoTotalEquipo + " min");
    }
    
    public void listarNombresCiclistas(){
        for(Ciclista C : ciclistas){
           System.out.println(C.getName()); 
        }
    }
    
    public void imprimirDatosCiclistaPorId(int id){
        for(Ciclista C: ciclistas){
            if (C.getIdentificador() == id){
                C.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista no encontrado");
    }
    
}
