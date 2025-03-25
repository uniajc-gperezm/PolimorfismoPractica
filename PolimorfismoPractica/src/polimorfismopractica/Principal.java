
package polimorfismopractica;

public class Principal {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Team A", "España");

        Velocista ciclista1 = new Velocista(1, "luis ", 400.5, 60.2);
        Velocista ciclista2 = new Velocista(2, "santiago", 380.3, 58.7);
        Velocista ciclista3 = new Velocista(3, "hanner", 410.1, 61.5);
        
        equipo.agregarCiclista(ciclista1);
        equipo.agregarCiclista(ciclista2);
        equipo.agregarCiclista(ciclista3);
        
        equipo.imprimirDatosEquipo();
    }
}
