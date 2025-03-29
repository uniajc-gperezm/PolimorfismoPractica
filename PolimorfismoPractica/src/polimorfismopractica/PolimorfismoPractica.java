/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismopractica;

import java.util.Scanner;

/**
 *
 * @author g.perezmoreno
 */
public class PolimorfismoPractica {

    public static void main(String[] args) {
        Scanner jk = new Scanner (System.in);
        Equipo equipo = new Equipo("Team A", "Colombia");
        
        Velocista Ve1 = new Velocista(1, "Rigo", 450, 60);
        Ve1.setTiempoAcumulado(110);
        
        Escalador Es1 = new Escalador(2, "Nairo Quintana", 2.5f, 15f);
        Es1.setTiempoAcumulado(130);
        
        Contrarrelojista Contra1 = new Contrarrelojista(3, "Juan", 47f);
        Contra1.setTiempoAcumulado(105);
        
        
        equipo.añadirCiclista(Ve1);
        System.out.println("");
        equipo.añadirCiclista(Es1);
        System.out.println("");
        equipo.añadirCiclista(Contra1);
        System.out.println("");
        equipo.listarNombresCiclistas();
        System.out.println("");
        equipo.calcularTiempoTotal();
        System.out.println("");
        equipo.imprimirDatosEquipo();
        System.out.println("");
        
        System.out.println("Ingresar el ID que desea buscar: ");
        int idEncontrado = jk.nextInt();
        equipo.imprimirDatosCiclistaPorId(idEncontrado);
        
        jk.close();
    }
    
}
