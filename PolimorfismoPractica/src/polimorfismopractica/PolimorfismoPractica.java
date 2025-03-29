/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismopractica;

/**
 *
 * @author g.perezmoreno
 */

public class PolimorfismoPractica {
    public static void main(String[] args) {
        // Crear equipo
        Equipo equipo = new Equipo("Team Sky", "Reino Unido");

        // Crear ciclistas
        Velocista velocista = new Velocista(1, "Mark Cavendish", 350.5f, 65.7f);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(2, "Nairo Quintana", 3.7f, 15.8f);
        escalador.setTiempoAcumulado(125);

        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Tony Martin", 55.8f);
        contrarrelojista.setTiempoAcumulado(118);

        // Añadir ciclistas al equipo
        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);

        // Imprimir información del equipo
        System.out.println("=== Información del Equipo ===");
        equipo.imprimirDatosEquipo();

        // Buscar ciclista por ID
        System.out.println("\n=== Búsqueda de Ciclista ===");
        equipo.buscarCiclista(2);
        equipo.buscarCiclista(4); // No existe
    }
}
