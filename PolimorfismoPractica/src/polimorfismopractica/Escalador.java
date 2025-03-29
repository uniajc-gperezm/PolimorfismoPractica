package polimorfismopractica;

public abstract class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    @Override
    public void imprimirDatos() {
        System.out.println("ID: " + getIdentificador());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Aceleración Promedio: " + aceleracionPromedio);
        System.out.println("Grado de Rampa: " + gradoRampa);
    }
}
