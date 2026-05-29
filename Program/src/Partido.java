import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Partido {
    private Equipo equipoUsuario;
    private Equipo equipoRival;

    private int golesUsuario;
    private int golesRival;

    private Scanner Sc;
    private Random random;

    //constructor
    public Partido(Equipo equipoUsuario, Equipo equipoRival) {

        this.equipoUsuario = equipoUsuario;
        this.equipoRival = equipoRival;

        this.golesUsuario = 0;
        this.golesRival = 0;

        Sc = new Scanner(System.in);
        random = new Random();
    }

    public void iniciarPartido() {

        System.out.println("\n=================================");
        System.out.println("        INICIO DEL PARTIDO");
        System.out.println("=================================");

        System.out.println(equipoUsuario.getNombre() + " VS " + equipoRival.getNombre());

        // 5 OCASIONES DE GOL
        for (int ocasion = 1; ocasion <= 5; ocasion++) {

            System.out.println("\n=================================");
            System.out.println("      OCASION DE GOL #" + ocasion);
            System.out.println("=================================");

            jugarOcasion();

            //mostrarMarcador();
        }
        //mostrarResultadoFinal();

        //actualizarTabla();
    }

    public void jugarOcasion() {

        System.out.println("\nTus jugadores:");

        ArrayList<Jugador> jugadores = equipoUsuario.getJugadores();

        //mostrar jugadores
        for (int i = 0; i < jugadores.size(); i++) {

            System.out.print((i + 1) + ". ");

            jugadores.get(i).mostrarInfo();
        }

        System.out.print("\nSelecciona un jugador: ");

        int opcionJugador =0;

        //validar opcion

        while (!Sc.hasNextInt()) {
            System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 5: ");
            Sc.next();
        }
        opcionJugador = Sc.nextInt();

        while (opcionJugador < 1 || opcionJugador > jugadores.size()) {
            System.out.print("Opcion invalida. Ingrese entre 1 y 5: ");

            while (!Sc.hasNextInt()) {
                System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 5: ");
                Sc.next();
            }

            opcionJugador = Sc.nextInt();
        }

        Jugador jugadorElegido = jugadores.get(opcionJugador - 1);

        System.out.println("Eligio al Jugador: ");

        jugadorElegido.mostrarInfo();

        Jugador jugador = jugadores.get(opcionJugador - 1);

        jugador.setDisparosRealizados(jugador.getDisparosRealizados() + 1);

        // validar energia
        if (jugador.getEnergia() <= 0) {

            System.out.println(jugador.getNombre() + " está agotado.");

            return;
        }

        //reducir energia al jugador elegido
        jugador.setEnergia(jugador.getEnergia() - 10);

        if (jugador.getEnergia() < 0) {
            jugador.setEnergia(0);
        }

        //mostrar opciones de disparo
        mostrarOpcionesDisparo();

        System.out.print("\nSelecciona dónde disparar: ");

        int zonaDisparo = Sc.nextInt();

        //validar
        while (zonaDisparo < 1 || zonaDisparo > 5) {

            System.out.print("Opcion invalida. Ingrese entre 1 y 5: ");

            while (!Sc.hasNextInt()) {

                System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 5: ");
                Sc.next();
            }

            zonaDisparo = Sc.nextInt();
        }
    }
    //crear el metodo de las opciones de disparo
    public void mostrarOpcionesDisparo() {

        System.out.println("\n¿Dónde quieres disparar?");

        System.out.println("1. Esquina superior izquierda");
        System.out.println("2. Esquina superior derecha");
        System.out.println("3. Centro");
        System.out.println("4. Esquina inferior izquierda");
        System.out.println("5. Esquina inferior derecha");
    }
}