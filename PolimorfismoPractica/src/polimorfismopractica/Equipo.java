
import polimorfismopractica.Ciclista;

public class Equipo {
    private String nombreEquipo;
    private static int sumaTiemposEquipo = 0;
    private String pais;
    private Ciclista ciclista1;
    private Ciclista ciclista2;
    private Ciclista ciclista3;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
    }

    public void agregarCiclista(Ciclista ciclista) {
        if (ciclista1 == null) {
            ciclista1 = ciclista;
        } else if (ciclista2 == null) {
            ciclista2 = ciclista;
        } else if (ciclista3 == null) {
            ciclista3 = ciclista;
        } else {
            System.out.println(" máximo de ciclistas.");
            return;
        }
        sumaTiemposEquipo += ciclista.getTiempoAcumulado();
    }

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo Total: " + sumaTiemposEquipo + " min");
        if (ciclista1 != null) {
            ciclista1.imprimirDatos();
        }
        if (ciclista2 != null) {
            ciclista2.imprimirDatos();
        }
        if (ciclista3 != null) {
            ciclista3.imprimirDatos();
        }
    }
}