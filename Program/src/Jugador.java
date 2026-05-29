public class Jugador {
    private String nombre;
    private int edad;
    private int numeroCamiseta;
    protected int energia; // protected: permite que las clases hijas lo modifiquen
    private int golesMarcados;
    private int disparosRealizados;
    private int partidosJugados;

    // agregamos el constructor
    public Jugador(String nombre, int edad, int numeroCamiseta, int energia) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
        this.energia = energia;
    }
    // agragamos el setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String actuarEnCampo() {
        return getNombre() + " está en el campo.";
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getDisparosRealizados() {
        return disparosRealizados;
    }

    public void setDisparosRealizados(int disparosRealizados) {
        this.disparosRealizados = disparosRealizados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Camiseta: " + numeroCamiseta + " | Energia: " + energia);
    }
}
