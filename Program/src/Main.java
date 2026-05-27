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
        while (opcionJugador < 1 || opcionJugador > equipos.size()) {
            System.out.print("Opcion invalida. Ingrese entre 1 y 8: ");

            while (!Sc.hasNextInt()) {
                System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 8: ");
                Sc.next();
            }

            opcionJugador = Sc.nextInt(); // Ahora sí lee de forma segura
        }


        Equipo equipoJugador = equipos.get(opcionJugador - 1);
        System.out.println("Elegiste: " + equipoJugador.getNombre());


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
            option = Sc.nextInt();



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

                    System.out.println("\n === JUGAR PARTIDO ===");
                    System.out.println("Su equipo actual es: " + equipoJugador.getNombre());
                    System.out.println("Seleccione el jugador con el que quiere jugar: ");
                    ArrayList<Jugador> jugadoresPartido = equipoJugador.getJugadores();
                    for (int i = 0; i < jugadoresPartido.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        jugadoresPartido.get(i).mostrarInfo();
                    }
                    int jugadorPartido= 0;

                    while (jugadorPartido < 1 || jugadorPartido > jugadoresPartido.size()) {
                        System.out.print("Opcion invalida. Ingrese entre 1 y 5: ");

                        while (!Sc.hasNextInt()) {
                            System.out.print("Opcion invalida. No ingrese letras, ingrese entre 1 y 5: ");
                            Sc.next();
                        }

                        jugadorPartido = Sc.nextInt();
                    }

                    Jugador jugadorElegido = jugadoresPartido.get(jugadorPartido - 1);
                    System.out.println("Eligio al Jugador: ");
                    jugadorElegido.mostrarInfo();



                    break;



                case 3:



                    break;





                case 4:




                    break;

                case 5:

                    System.out.println("\n=== CAMBIAR EQUIPO ===");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
                    }

                    System.out.print("Ingrese el numero del nuevo equipo: ");

                    int nuevaOpcion= 0;
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
