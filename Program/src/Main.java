import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //EQUIPO 1 - Colombia
        Delantero col1 = new Delantero("James Rodriguez",    32, 10, 95, 48, 88, "Delantero", 85);
        Delantero col2 = new Delantero("Falcao Garcia",      37,  9, 80, 52, 78, "Delantero", 80);
        Delantero col3 = new Delantero("Luis Diaz",          26,  7, 85, 44, 82, "Delantero", 83);
        Delantero col4 = new Delantero("Cuadrado",           35,  8, 70, 38, 70, "Delantero", 72);
        Arquero   col5 = new Arquero  ("David Ospina",       35,  1, 88, 75, 80, 15, "Arquero");

        ArrayList<Jugador> jugadoresCol = new ArrayList<>();
        jugadoresCol.add(col1);
        jugadoresCol.add(col2);
        jugadoresCol.add(col3);
        jugadoresCol.add(col4);
        jugadoresCol.add(col5);

        Equipo colombia = new Equipo("Colombia", "Barranquilla", 0, 0, jugadoresCol);

        //EQUIPO 2 - Brasil
        Delantero bra1 = new Delantero("Vinicius Jr",  23, 10, 97, 55, 90, "Delantero", 92);
        Delantero bra2 = new Delantero("Neymar",       31,  9, 88, 50, 87, "Delantero", 88);
        Delantero bra3 = new Delantero("Rodrygo",      22,  7, 82, 40, 80, "Delantero", 81);
        Delantero bra4 = new Delantero("Richarlison",  26,  8, 75, 42, 73, "Delantero", 74);
        Arquero   bra5 = new Arquero  ("Alisson",      31,  1, 92, 85, 90, 10, "Arquero");

        ArrayList<Jugador> jugadoresBra = new ArrayList<>();
        jugadoresBra.add(bra1);
        jugadoresBra.add(bra2);
        jugadoresBra.add(bra3);
        jugadoresBra.add(bra4);
        jugadoresBra.add(bra5);

        Equipo brasil = new Equipo("Brasil", "Sao Paulo", 0, 0, jugadoresBra);

        // EQUIPO 3 - Argentina
        Delantero arg1 = new Delantero("Messi",        36, 10, 99, 60, 95, "Delantero", 95);
        Delantero arg2 = new Delantero("Lautaro",      26,  9, 87, 50, 83, "Delantero", 84);
        Delantero arg3 = new Delantero("Di Maria",     35,  7, 78, 42, 78, "Delantero", 79);
        Delantero arg4 = new Delantero("Alvarez",      24,  8, 75, 38, 72, "Delantero", 73);
        Arquero   arg5 = new Arquero  ("E. Martinez", 31,  1, 93, 88, 92, 8,  "Arquero");

        ArrayList<Jugador> jugadoresArg = new ArrayList<>();
        jugadoresArg.add(arg1);
        jugadoresArg.add(arg2);
        jugadoresArg.add(arg3);
        jugadoresArg.add(arg4);
        jugadoresArg.add(arg5);

        Equipo argentina = new Equipo("Argentina", "Buenos Aires", 0, 0, jugadoresArg);

        //EQUIPO 4 - Francia
        Delantero fra1 = new Delantero("Mbappe",       25, 10, 96, 57, 92, "Delantero", 93);
        Delantero fra2 = new Delantero("Griezmann",    32,  9, 83, 45, 80, "Delantero", 81);
        Delantero fra3 = new Delantero("Dembele",      26,  7, 80, 40, 78, "Delantero", 79);
        Delantero fra4 = new Delantero("Giroud",       37,  8, 72, 44, 70, "Delantero", 71);
        Arquero   fra5 = new Arquero  ("Maignan",      28,  1, 89, 80, 86, 12, "Arquero");

        ArrayList<Jugador> jugadoresFra = new ArrayList<>();
        jugadoresFra.add(fra1);
        jugadoresFra.add(fra2);
        jugadoresFra.add(fra3);
        jugadoresFra.add(fra4);
        jugadoresFra.add(fra5);

        Equipo francia = new Equipo("Francia", "Paris", 0, 0, jugadoresFra);

        //EQUIPO 5 - Alemania
        Delantero ale1 = new Delantero("Kane",         30, 10, 90, 52, 87, "Delantero", 88);
        Delantero ale2 = new Delantero("Muller",       34,  9, 78, 46, 75, "Delantero", 76);
        Delantero ale3 = new Delantero("Gnabry",       28,  7, 76, 38, 74, "Delantero", 75);
        Delantero ale4 = new Delantero("Havertz",      24,  8, 73, 35, 70, "Delantero", 71);
        Arquero   ale5 = new Arquero  ("Neuer",        37,  1, 88, 82, 88, 14, "Arquero");

        ArrayList<Jugador> jugadoresAle = new ArrayList<>();
        jugadoresAle.add(ale1);
        jugadoresAle.add(ale2);
        jugadoresAle.add(ale3);
        jugadoresAle.add(ale4);
        jugadoresAle.add(ale5);

        Equipo alemania = new Equipo("Alemania", "Berlin", 0, 0, jugadoresAle);

        //EQUIPO 6 - España
        Delantero esp1 = new Delantero("Yamal",        16, 10, 88, 45, 85, "Delantero", 86);
        Delantero esp2 = new Delantero("Morata",       31,  9, 78, 44, 74, "Delantero", 75);
        Delantero esp3 = new Delantero("Olmo",         25,  7, 76, 38, 73, "Delantero", 74);
        Delantero esp4 = new Delantero("Williams",     21,  8, 74, 36, 71, "Delantero", 72);
        Arquero   esp5 = new Arquero  ("Unai Simon",   27,  1, 85, 76, 82, 16, "Arquero");

        ArrayList<Jugador> jugadoresEsp = new ArrayList<>();
        jugadoresEsp.add(esp1);
        jugadoresEsp.add(esp2);
        jugadoresEsp.add(esp3);
        jugadoresEsp.add(esp4);
        jugadoresEsp.add(esp5);

        Equipo espana = new Equipo("España", "Madrid", 0, 0, jugadoresEsp);

        // EQUIPO 7 - Portugal
        Delantero por1 = new Delantero("Cristiano",    39,  7, 91, 58, 88, "Delantero", 87);
        Delantero por2 = new Delantero("Bruno F.",     29, 10, 84, 46, 80, "Delantero", 81);
        Delantero por3 = new Delantero("Leao",         24,  8, 80, 40, 78, "Delantero", 79);
        Delantero por4 = new Delantero("Joao Felix",   24,  9, 75, 37, 73, "Delantero", 74);
        Arquero   por5 = new Arquero  ("Costa",        31,  1, 84, 74, 80, 17, "Arquero");

        ArrayList<Jugador> jugadoresPor = new ArrayList<>();
        jugadoresPor.add(por1);
        jugadoresPor.add(por2);
        jugadoresPor.add(por3);
        jugadoresPor.add(por4);
        jugadoresPor.add(por5);

        Equipo portugal = new Equipo("Portugal", "Lisboa", 0, 0, jugadoresPor);

        //EQUIPO 8 - Inglaterra
        Delantero ing1 = new Delantero("Bellingham",   20, 10, 87, 44, 83, "Delantero", 84);
        Delantero ing2 = new Delantero("Saka",         22,  7, 82, 40, 80, "Delantero", 81);
        Delantero ing3 = new Delantero("Foden",        23,  8, 79, 38, 77, "Delantero", 78);
        Delantero ing4 = new Delantero("Rashford",     26,  9, 75, 36, 73, "Delantero", 74);
        Arquero   ing5 = new Arquero  ("Pickford",     30,  1, 83, 72, 79, 18, "Arquero");

        ArrayList<Jugador> jugadoresIng = new ArrayList<>();
        jugadoresIng.add(ing1);
        jugadoresIng.add(ing2);
        jugadoresIng.add(ing3);
        jugadoresIng.add(ing4);
        jugadoresIng.add(ing5);

        Equipo inglaterra = new Equipo("Inglaterra", "Londres", 0, 0, jugadoresIng);

        //Lista de todos los equipos
        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(colombia);
        equipos.add(brasil);
        equipos.add(argentina);
        equipos.add(francia);
        equipos.add(alemania);
        equipos.add(espana);
        equipos.add(portugal);
        equipos.add(inglaterra);




        System.out.println("=== BIENVENIDO A LA COPA ===");
        System.out.println("Elige tu equipo:");
        System.out.println();

        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }

        System.out.print("\nIngresa el numero de tu equipo: ");
        int opcionEquipo = sc.nextInt();

        // Validar que la opcion sea valida
        while (opcionEquipo < 1 || opcionEquipo > 8) {
            System.out.print("Opcion invalida. Elige entre 1 y 8: ");
            opcionEquipo = sc.nextInt();
        }

        Equipo equipoUsuario = equipos.get(opcionEquipo - 1);
        System.out.println("\nElegiste: " + equipoUsuario.getNombre());

    }
}
