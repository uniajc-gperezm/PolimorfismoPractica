
package polimorfismopractica;

public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador, String name, double velocidadMaxima){
        super(identificador, name);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String imprimirTipo(){
        return "Es un Contrarrelojista";
    }
    
    public void imprimir(){
        super.imprimirDatos();
        System.out.println("Velocidad Maxima: " + velocidadMaxima + "km/h");
    }
}
