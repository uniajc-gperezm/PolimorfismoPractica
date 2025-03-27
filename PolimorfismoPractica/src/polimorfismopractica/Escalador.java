
package polimorfismopractica;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;
    
    public Escalador(int identificador, String name, float aceleracionPromedio, float gradoRampa){
        super(identificador, name);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }
    
    public float getAceleracionPromedio(){
        return aceleracionPromedio;
    }
    
    public void setAceleracionPromedio(float aceleracionPromedio){
        this.aceleracionPromedio = aceleracionPromedio;
    }
    
    public float getGradoRampa(){
        return gradoRampa;
    }
    
    public void setGradoRampa(float gradoRampa){
        this.gradoRampa = gradoRampa;
    }
    
    public String imprimirTipo(){
        return "Es un Escalador";
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Aceleración Promedio: " + aceleracionPromedio + " m/s², Grado de Rampa: " + gradoRampa + "°");
    }
}
