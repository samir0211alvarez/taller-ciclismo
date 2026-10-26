package ciclismo;

import java.util.ArrayList;
import java.util.List;

/**
 * Un equipo agrega (relación de agregación) un conjunto de ciclistas.
 */
public class Equipo {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0; // suma de tiempos (minutos), estático
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    /** Añade un ciclista y suma su tiempo acumulado al tiempo total. */
    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        tiempoTotalEquipo += ciclista.getTiempoAcumulado();
    }

    public void imprimirDatosEquipo() {
        System.out.println("=== Equipo ===");
        System.out.println("Nombre: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " min");
        System.out.println("Cantidad de ciclistas: " + ciclistas.size());
    }

    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            System.out.println(" - " + c.getNombre() + " (" + c.imprimirTipo() + ")");
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No existe un ciclista con identificador " + id);
    }
}
