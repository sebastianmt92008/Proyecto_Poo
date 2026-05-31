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

            mostrarMarcador();
        }
        mostrarResultadoFinal();

        actualizarTabla();
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

        // se pide escoger otro jugador
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

        int zonaDisparo =0;

        //validar
        while (!Sc.hasNextInt()) {

            System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 5: ");
            Sc.next();
        }
        zonaDisparo = Sc.nextInt();
        while (zonaDisparo < 1 || zonaDisparo > 5) {

            System.out.print("Opcion invalida. Ingrese entre 1 y 5: ");

            while (!Sc.hasNextInt()) {

                System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 5: ");
                Sc.next();
            }

            zonaDisparo = Sc.nextInt();
        }
        boolean gol = calcularGol(jugador);

        if (gol) {

            golesUsuario++;

            System.out.println("\nGOOOOOOOOOOL!!!");

            System.out.println(jugador.getNombre() + " marca para " + equipoUsuario.getNombre());

            jugador.setGolesMarcados(jugador.getGolesMarcados() + 1);

        } else {

            System.out.println("\nFALLASTE LA OCASIÓN");
            System.out.println("El rival aprovecha el contraataque...");
            golesRival++;
            System.out.println("GOL DE " + equipoRival.getNombre());
        }

        System.out.println("\nEnergía restante de " + jugador.getNombre() + ": " + jugador.getEnergia());
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

    // crear metodo de calcular gol
    public boolean calcularGol(Jugador jugador) {
        int precision = 15;

        if (jugador instanceof Delantero) {
            Delantero delantero = (Delantero) jugador;
            precision = delantero.getPrecision();
        }

        int probabilidadGol = precision;

        int intento = random.nextInt(100) + 1;

        return intento <= probabilidadGol;
    }

    public void mostrarMarcador() {

        System.out.println("\n=================================");

        System.out.println(equipoUsuario.getNombre() + " " + golesUsuario + " - " + golesRival + " " + equipoRival.getNombre());

        System.out.println("=================================");
    }

    //crear metodo para mostrar el resultado final del partido
    public void mostrarResultadoFinal() {

        System.out.println("\n=================================");
        System.out.println("        FINAL DEL PARTIDO");
        System.out.println("=================================");

        mostrarMarcador();

        if (golesUsuario > golesRival) {
            System.out.println("\nGANASTE EL PARTIDO!!!");

        } else if (golesUsuario < golesRival) {
            System.out.println("\nPERDISTE EL PARTIDO");

        } else {
            System.out.println("\nEMPATE");
        }
    }

    public void actualizarTabla() {

        // goles
        equipoUsuario.setGolesFavor(equipoUsuario.getGolesFavor() + golesUsuario);
        equipoUsuario.setGolesContra(equipoUsuario.getGolesContra() + golesRival);
        equipoRival.setGolesFavor(equipoRival.getGolesFavor() + golesRival);
        equipoRival.setGolesContra(equipoRival.getGolesContra() + golesUsuario);
        equipoUsuario.setPartidosJugados(equipoUsuario.getPartidosJugados() + 1);

        // victoria del usuario
        if (golesUsuario > golesRival) {

            equipoUsuario.setPuntos(equipoUsuario.getPuntos() + 3);
            equipoUsuario.setPartidosGanados(equipoUsuario.getPartidosGanados() + 1);
            equipoRival.setPartidosPerdidos(equipoRival.getPartidosPerdidos() + 1);
        }

        // victoria rival
        else if (golesRival > golesUsuario) {

            equipoRival.setPuntos(equipoRival.getPuntos() + 3);
            equipoRival.setPartidosGanados(equipoRival.getPartidosGanados() + 1);
            equipoUsuario.setPartidosPerdidos(equipoUsuario.getPartidosPerdidos() + 1);
        }

        // empate
        else {

            equipoUsuario.setPuntos(equipoUsuario.getPuntos() + 1);
            equipoRival.setPuntos(equipoRival.getPuntos() + 1);

        }
    }
}