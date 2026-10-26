package ciclismo;

public class Main {
    public static void main(String[] args) {
        Velocista v = new Velocista(1, "Mark Cavendish", 1200.0, 70.5);
        Escalador e = new Escalador(2, "Egan Bernal", 1.8f, 12.5f);
        Contrarrelojista c = new Contrarrelojista(3, "Filippo Ganna", 58.3);

        v.setTiempoAcumulado(310);
        e.setTiempoAcumulado(325);
        c.setTiempoAcumulado(300);

        Equipo equipo = new Equipo("Team Colombia", "Colombia");
        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.imprimirDatosEquipo();
        System.out.println();
        equipo.listarNombresCiclistas();
        System.out.println();
        System.out.println("--- Ciclista con ID 2 ---");
        equipo.imprimirDatosCiclistaPorId(2);
        System.out.println();
        System.out.println("--- Ciclista con ID 99 ---");
        equipo.imprimirDatosCiclistaPorId(99);
    }
}
