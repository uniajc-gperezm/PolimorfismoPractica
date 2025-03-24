package polimorfismopractica;

public class Velocista extends Ciclista {

    private double potencialPromedio;
    private double velocidadSprint;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(id, nombre);
        this.potencialPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;

    }

    public double getpotenciaPromedio() {
        return potencialPromedio;
    }

    public void setpotencialPromedio(double potencialPromedio) {
        this.potencialPromedio = potencialPromedio;

    }

    public double getvelocidadSprint() {
        return velocidadSprint;
    }

    public void setvelocidadSprint(double velocidadSprint) {
        this.velocidadSprint = velocidadSprint;
    }

    @Override
    public String imprimirTipo() {
        return "es velocista";
    }
    

}
