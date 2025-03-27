
package polimorfismopractica;

public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedioSprint;
    
    public Velocista(int identificador, String name, double potenciaPromedio, double valocidadPromedioSprint){
        super(identificador, name);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
    
    public double getPotenciaPromedio(){
        return potenciaPromedio;
    }
    
    public void setPotenciaPromedio(double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
    }
    
    public double getVelocidadPromedioSprint(){
        return velocidadPromedioSprint;
    }
    
    public void setVelocidadPromedioSprint(double velocidadPromedioSprint){
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
    
    public String imprimirTipo(){
        return "Es un Velocista";
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Potencia Promedio: " + potenciaPromedio + " W, Velocidad Sprint: " + velocidadPromedioSprint + " km/h");
    }
}
