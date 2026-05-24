public class Arquero extends Jugador{
    private int atajadas;
    private int reflejos;
    private int golesRecibidos;
    private String posicion;

    public Arquero(String nombre, int edad, int numeroCamiseta, int energia, int atajadas, int reflejos, int golesRecibidos, String posicion) {
        super(nombre, edad, numeroCamiseta, energia);
        this.atajadas = atajadas;
        this.reflejos = reflejos;
        this.golesRecibidos = golesRecibidos;
        this.posicion = posicion;
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String actuarEnCampo() {
        return getNombre() + " se lanza y realiza una atajada. Total atajadas: " + atajadas + ".";
    }

    public void mostrarInfo() {
        System.out.println("Arquero: " + getNombre() + " | Atajadas: " + atajadas + " | Reflejos: " + reflejos + " | Energia: " + getEnergia());
    }
}
