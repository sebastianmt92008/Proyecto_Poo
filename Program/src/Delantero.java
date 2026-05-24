public class Delantero extends Jugador {

    private int golesAnotados;
    private int precision;
    private String posicion;
    private int velocidadDisparo;

    //contructor
    public Delantero(String nombre, int edad, int numeroCamiseta, int energia ,int golesAnotados, int precision, String posicion, int velocidadDisparo) {
        super(nombre, edad, numeroCamiseta, energia);
        this.golesAnotados = golesAnotados;
        this.precision = precision;
        this.posicion = posicion;
        this.velocidadDisparo = velocidadDisparo;
    }

    //setter y getter
    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    @Override
    public String actuarEnCampo() {
        return getNombre() + " corre hacia el arco y dispara con precisión de " + precision + ".";
    }

    public void mostrarInfo() {
        System.out.println("Delantero: " + getNombre() + " | Goles: " + golesAnotados + " | Precision: " + precision + " | Velocidad: " + velocidadDisparo + " | Energia: " + getEnergia());
    }
}
