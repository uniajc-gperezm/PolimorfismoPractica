/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismopractica;

/**
 *
 * @author sgrue
 */
public class Velocista extends Ciclista{

    private double potenciaPromedio;
    private double velocidadPromedioSprint;
    
   
    public Velocista(double potenciaPromedio, double velocidadPromedioSprint, int identificador, String name) {
        super(identificador, name);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    @Override
    String imprimirTipo() {
        return "";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
    }
    
}
