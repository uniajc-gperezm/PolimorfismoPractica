/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismopractica;

/**
 *
 * @author estudiante103
 */
public class Velocista {
    private double potenciaPromedio, velocidadPromedioSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
     
    protected String imprimirTipo(){
        System.out.println("");
        //esta incompleto
        return null;
    }
    
    protected void imprimirDatos(){
    }
}
