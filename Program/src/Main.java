import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        Torneo torneo = new Torneo();
        ArrayList<Equipo> equipos = torneo.InicializarEquipos();

        System.out.println("=== COPA MUNDIAL ===");
        for(int i=0; i<equipos.size(); i++){
            System.out.println((i+1) + " " + equipos.get(i).getNombre());

        }

        System.out.println("Ingrese el equipo con el que quiere participar");
        int opcionJugador = Sc.nextInt();

        Equipo equipoJugador = equipos.get(opcionJugador - 1);


        int option = 0;
        do{

            System.out.println("\n=== COPA MUNDIAL ===");
            System.out.println("Equipo: " + equipoJugador.getNombre());
            System.out.println("1. Ver equipos y jugadores");
            System.out.println("2. Simular partido");
            System.out.println("3. Tabla de posiciones");
            System.out.println("4. Estadisticas");
            System.out.println("5. Salir");
            option = Sc.nextInt();



            switch (option){

                case 1:

                    System.out.println("Ingrese el nombre del equipo: ");
                    String equipoBuscar = Sc.next();

                    Torneo.MostrarJugadores(equipos,equipoBuscar);




                    break;




                case 2:



                    break;



                case 3:



                    break;





                case 4:




                    break;





                default:



                    break;

            }

        }while (option!=5);




    }
}
