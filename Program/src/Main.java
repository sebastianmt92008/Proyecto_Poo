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
        boolean valido = false;
        while (!valido){
            if (Sc.hasNextInt()){
                opcionJugador = Sc.nextInt();
                if (opcionJugador >=1 && opcionJugador <= equipos.size()){
                    valido = true;
                } else {
                    System.out.println("Opcion invalida. Eliga un numero entre 1 y 8: ");
                }
            } else {
                System.out.println("Opcion invalida. No ingrese letras, ingrese números entre 1 y 8");
                Sc.next();
            }
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
                    boolean validoPartido = false;

                    while (!validoPartido){
                        if (Sc.hasNextInt()){
                            jugadorPartido = Sc.nextInt();
                            if (jugadorPartido >=1 && jugadorPartido <= jugadoresPartido.size()){
                                validoPartido = true;
                            } else {
                                System.out.println("Opcion invalida. Eliga un numero entre 1 y 5: ");
                            }
                        } else {
                            System.out.println("Opcion invalida. No ingrese letras, ingrese números entre 1 y 8: ");
                            Sc.next();
                        }
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
                    boolean validoNuevaOpcion = false;

                    while (!validoNuevaOpcion){
                        if (Sc.hasNextInt()){
                            nuevaOpcion = Sc.nextInt();
                            if (nuevaOpcion >=1 && nuevaOpcion <= equipos.size()){
                                validoNuevaOpcion = true;
                            } else {
                                System.out.println("Opcion invalida. Eliga un numero entre 1 y 8: ");
                            }
                        } else {
                            System.out.println("Opcion invalida. No ingrese letras, ingrese números entre 1 y 8: ");
                            Sc.next();
                        }
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
