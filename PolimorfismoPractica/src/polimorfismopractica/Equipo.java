package polimorfismopractica;

import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String pais, List<Ciclista> ciclistas) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = ciclistas;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void setCiclistas(List<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public List<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void imprimirDatosEquipo(){}
    
    public void listarNombresCiclistas(){}
    
    public void imprimirDatosCiclistasPorId(){}
    
}
