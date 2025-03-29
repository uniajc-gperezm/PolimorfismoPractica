package polimorfismopractica;

class Escalador extends Ciclista {
    private float aceleracionSubida;
    private float gradoRampa;
    
    public Escalador(int identificador, String name, float aceleracionSubida, float gradoRampa) {
        super(identificador, name);
        this.aceleracionSubida = aceleracionSubida;
        this.gradoRampa = gradoRampa;
    }
    
     protected float getAceleracionSubida() {
        return aceleracionSubida;
    }

    protected void setAceleracionSubida(float aceleracionSubida) {
        this.aceleracionSubida = aceleracionSubida;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Es un escalador";
    }
        @Override
        public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración en Subida: " + aceleracionSubida + " m/s²");
        System.out.println("Grado de Rampa: " + gradoRampa + "°");
    }
}