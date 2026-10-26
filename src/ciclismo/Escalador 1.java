package ciclismo;

public class Escalador extends Ciclista {

    private float aceleracionPromedio; // m/s2 en subida
    private float gradoRampa;          // grados

    public Escalador(int identificador, String nombre,
                     float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected float getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Aceleración promedio en subida: " + aceleracionPromedio + " m/s2");
        System.out.println("Grado de rampa soportada: " + gradoRampa + " grados");
    }
}
