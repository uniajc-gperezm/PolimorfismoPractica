package polimorfismopractica;

public class Velocista {
    private double potenciaPromedio, velocidadPromedioSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
     
    protected String imprimirTipo(){
        System.out.println("");
        //esta incompleto
    }
    
    protected void imprimirDatos(){
    }
}
