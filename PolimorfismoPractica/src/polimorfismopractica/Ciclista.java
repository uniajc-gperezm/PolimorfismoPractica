/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismopractica;

/**
 *  
 * @author g.perezmoreno
 */
public abstract class Ciclista {
    private int identificador;
    private String name;
    private int tiempoAcumulado;

    public Ciclista(int identificador, String name) {
        this.identificador = identificador;
        this.name = name;
        this.tiempoAcumulado = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempo) {
        this.tiempoAcumulado = tiempo;
    }
    
    abstract String imprimirTipo();
    
    public void imprimirDatos(){
        System.out.println("ID: " + identificador + ", Nombre: " + name + ", Tiempo acumulado: " + tiempoAcumulado + " min");
    }
    
}
