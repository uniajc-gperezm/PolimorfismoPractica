/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismopractica;

/**
 *
 * @author g.perezmoreno
 */

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempo) {
        tiempoTotalEquipo = tiempo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        calcularTotalTiempo();
    }

    public void listarNombresCiclista() {
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre());
        }
    }

    public void buscarCiclista(int identificador) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == identificador) {
                ciclista.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista no encontrado");
    }

    public void calcularTotalTiempo() {
        tiempoTotalEquipo = 0;
        for (Ciclista ciclista : ciclistas) {
            tiempoTotalEquipo += ciclista.getTiempoAcumulado();
        }
    }

    public void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Total tiempo: " + tiempoTotalEquipo);
    }

    public void imprimirDatosCiclistasPorIp() {
        for (Ciclista ciclista : ciclistas) {
            ciclista.imprimirDatos();
        }
    }
}