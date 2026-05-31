import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        Torneo torneo = new Torneo();
        ArrayList<Equipo> equipos = torneo.InicializarEquipos();

        System.out.println("=== COPA MUNDIAL ===");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }

        System.out.print("Ingrese el numero del equipo con el que quiere participar: ");
        int opcionJugador= 0;
        while (!Sc.hasNextInt()) {
            System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 8: ");
            Sc.next();
        }
        opcionJugador = Sc.nextInt();

        while (opcionJugador < 1 || opcionJugador > equipos.size()) {
            System.out.print("Opcion invalida. Ingrese entre 1 y 8: ");

            while (!Sc.hasNextInt()) {
                System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 8: ");
                Sc.next();
            }

            opcionJugador = Sc.nextInt();
        }


        Equipo equipoJugador = equipos.get(opcionJugador - 1);
        System.out.println("\nElegiste: " + equipoJugador.getNombre());


        int option = 0;
        do{

            System.out.println("\n=== LA LIGA ===");
            System.out.println("Equipo elegido: " + equipoJugador.getNombre());
            System.out.println("1. Ver jugadores de mi equipo");
            System.out.println("2. Simular partido");
            System.out.println("3. Tabla de posiciones");
            System.out.println("4. Estadisticas");
            System.out.println("5. Cambiar equipo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            while (!Sc.hasNextInt()) {
                System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 6: ");
                Sc.next();
            }
            option = Sc.nextInt();

            while (option < 1 || option > 6) {
                System.out.print("Opcion invalida. Ingrese entre 1 y 6: ");

                while (!Sc.hasNextInt()) {
                    System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 6: ");
                    Sc.next();
                }

                option = Sc.nextInt();
            }

            switch (option){

                case 1:

                    System.out.println("\n=== JUGADORES DE " + equipoJugador.getNombre().toUpperCase() + " ===");
                    ArrayList<Jugador> jugadoresEquipo = equipoJugador.getJugadores();
                    for (int i = 0; i < jugadoresEquipo.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        jugadoresEquipo.get(i).mostrarInfo();
                    }
                    break;



                case 2:

                    Equipo equipoRival;

                    do {
                        int rivalRandom = (int)(Math.random() * equipos.size());
                        equipoRival = equipos.get(rivalRandom);

                    } while (equipoRival == equipoJugador || equipoRival.getPartidosJugados() > 0);

                    System.out.println("\nSu rival sera: " + equipoRival.getNombre());

                    //iniciar partido
                    Partido partido = new Partido(equipoJugador, equipoRival);
                    partido.iniciarPartido();

                    int partidosTotalesUsuario = equipos.size() - 1;
                    if (equipoJugador.getPartidosJugados() == partidosTotalesUsuario) {
                        System.out.println("\n=============================================");
                        System.out.println("¡HAZ JUGADO TODOS TUS PARTIDOS! EL TORNEO FINALIZÓ");
                        System.out.println("=============================================");

                        torneo.mostrarTabla(equipos);

                        System.out.println("\nGracias por participar en la liga.");
                        System.exit(0); //Le dice al sistema que finalice el programa, el 0 significa que todo salio bien.
                    }

                    break;



                case 3:

                    torneo.mostrarTabla(equipos);

                    break;





                case 4:

                    equipoJugador.mostrarEstadisticasJugadores();
                    break;


                case 5:

                    System.out.println("\n=== CAMBIAR EQUIPO ===");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
                    }

                    System.out.print("Ingrese el numero del nuevo equipo: ");

                    int nuevaOpcion= 0;
                    while (!Sc.hasNextInt()) {
                        System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 8: ");
                        Sc.next();
                    }
                    nuevaOpcion = Sc.nextInt();
                    while (nuevaOpcion < 1 || nuevaOpcion > equipos.size()) {
                        System.out.print("Opcion invalida. Ingrese entre 1 y 8: ");

                        while (!Sc.hasNextInt()) {
                            System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 8: ");
                            Sc.next();
                        }

                        nuevaOpcion = Sc.nextInt();
                    }
                    equipoJugador = equipos.get(nuevaOpcion - 1);
                    System.out.println("Ahora juegas con: " + equipoJugador.getNombre());
                    break;



                default:
                    System.out.println("Opcion invalida. Ingrese entre 1 y 6.");
                    break;


            }

        }while (option!=6);




    }
}
