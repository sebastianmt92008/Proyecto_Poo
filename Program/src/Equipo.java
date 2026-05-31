import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;
    private int partidosGanados;
    private int partidosPerdidos;
    private int golesFavor;
    private int golesContra;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String ciudad, int puntos, int partidosGanados, int partidosPerdidos, int golesFavor, int golesContra,  ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() { return partidosPerdidos;}

    public void setPartidosPerdidos(int partidosPerdidos) { this.partidosPerdidos = partidosPerdidos; }

    public int getGolesFavor() { return golesFavor; }

    public void setGolesFavor(int golesFavor) { this.golesFavor = golesFavor; }

    public int getGolesContra() { return golesContra; }

    public void setGolesContra(int golesContra) { this.golesContra = golesContra; }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) { this.jugadores = jugadores; }


    public void mostrarEstadisticasJugadores() {

        System.out.println("\n=== ESTADISTICAS DE JUGADORES ===");

        for (int i = 0; i < jugadores.size(); i++) {

            Jugador j = jugadores.get(i);
            System.out.println("\nJugador: " + j.getNombre());

            System.out.println("Goles: " + j.getGolesMarcados());

            System.out.println("Disparos: " + j.getDisparosRealizados());

            System.out.println("Energia: " + j.getEnergia());
        }
    }
}
