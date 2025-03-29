/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismopractica;

/**
 *
 * @author Luis Fernando
 */
public class Contrarrelojista extends Ciclista {
   
    private double velocidadMaxima;

    
    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre); 
        this.velocidadMaxima = velocidadMaxima;
    }

   
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

   
    @Override
    public String imprimirTipo() {
        return "Contrarrelojista";
    }

    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos(); 
        
    }
}
