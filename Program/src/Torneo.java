import java.util.ArrayList;

public class Torneo {
    public ArrayList<Equipo> InicializarEquipos(){
        ArrayList<Equipo> equipos = new ArrayList<>();

        ArrayList<Jugador> jugadoresCol = new ArrayList<>();
        jugadoresCol.add(new Delantero("James Rodriguez",    32, 10, 95, 48, 88, "Delantero", 85));
        jugadoresCol.add(new Delantero("Falcao Garcia",      37,  9, 80, 52, 78, "Delantero", 80));
        jugadoresCol.add(new Delantero("Luis Diaz",          26,  7, 85, 44, 82, "Delantero", 83));
        jugadoresCol.add(new Delantero("Cuadrado",           35,  8, 70, 38, 70, "Delantero", 72));
        jugadoresCol.add(new Arquero  ("David Ospina",       35,  1, 88, 75, 80, 15, "Arquero"));
        equipos.add(new Equipo("Colombia", "Barranquilla", 0, 0, jugadoresCol));

        ArrayList<Jugador> jugadoresBra = new ArrayList<>();
        jugadoresBra.add(new Delantero("Vinicius Jr",  23, 10, 97, 55, 90, "Delantero", 92));
        jugadoresBra.add(new Delantero("Neymar",       31,  9, 88, 50, 87, "Delantero", 88));
        jugadoresBra.add(new Delantero("Rodrygo",      22,  7, 82, 40, 80, "Delantero", 81));
        jugadoresBra.add(new Delantero("Richarlison",  26,  8, 75, 42, 73, "Delantero", 74));
        jugadoresBra.add(new Arquero  ("Alisson",      31,  1, 92, 85, 90, 10, "Arquero"));
        equipos.add(new Equipo("Brasil", "Sao Paulo", 0, 0, jugadoresBra));

// Argentina
        ArrayList<Jugador> jugadoresArg = new ArrayList<>();
        jugadoresArg.add(new Delantero("Messi",        36, 10, 99, 60, 95, "Delantero", 95));
        jugadoresArg.add(new Delantero("Lautaro",      26,  9, 87, 50, 83, "Delantero", 84));
        jugadoresArg.add(new Delantero("Di Maria",     35,  7, 78, 42, 78, "Delantero", 79));
        jugadoresArg.add(new Delantero("Alvarez",      24,  8, 75, 38, 72, "Delantero", 73));
        jugadoresArg.add(new Arquero  ("E. Martinez",  31,  1, 93, 88, 92,  8, "Arquero"));
        equipos.add(new Equipo("Argentina", "Buenos Aires", 0, 0, jugadoresArg));

// Francia
        ArrayList<Jugador> jugadoresFra = new ArrayList<>();
        jugadoresFra.add(new Delantero("Mbappe",       25, 10, 96, 57, 92, "Delantero", 93));
        jugadoresFra.add(new Delantero("Griezmann",    32,  9, 83, 45, 80, "Delantero", 81));
        jugadoresFra.add(new Delantero("Dembele",      26,  7, 80, 40, 78, "Delantero", 79));
        jugadoresFra.add(new Delantero("Giroud",       37,  8, 72, 44, 70, "Delantero", 71));
        jugadoresFra.add(new Arquero  ("Maignan",      28,  1, 89, 80, 86, 12, "Arquero"));
        equipos.add(new Equipo("Francia", "Paris", 0, 0, jugadoresFra));

// Alemania
        ArrayList<Jugador> jugadoresAle = new ArrayList<>();
        jugadoresAle.add(new Delantero("Kane",         30, 10, 90, 52, 87, "Delantero", 88));
        jugadoresAle.add(new Delantero("Muller",       34,  9, 78, 46, 75, "Delantero", 76));
        jugadoresAle.add(new Delantero("Gnabry",       28,  7, 76, 38, 74, "Delantero", 75));
        jugadoresAle.add(new Delantero("Havertz",      24,  8, 73, 35, 70, "Delantero", 71));
        jugadoresAle.add(new Arquero  ("Neuer",        37,  1, 88, 82, 88, 14, "Arquero"));
        equipos.add(new Equipo("Alemania", "Berlin", 0, 0, jugadoresAle));

// España
        ArrayList<Jugador> jugadoresEsp = new ArrayList<>();
        jugadoresEsp.add(new Delantero("Yamal",        16, 10, 88, 45, 85, "Delantero", 86));
        jugadoresEsp.add(new Delantero("Morata",       31,  9, 78, 44, 74, "Delantero", 75));
        jugadoresEsp.add(new Delantero("Olmo",         25,  7, 76, 38, 73, "Delantero", 74));
        jugadoresEsp.add(new Delantero("Williams",     21,  8, 74, 36, 71, "Delantero", 72));
        jugadoresEsp.add(new Arquero  ("Unai Simon",   27,  1, 85, 76, 82, 16, "Arquero"));
        equipos.add(new Equipo("España", "Madrid", 0, 0, jugadoresEsp));

// Portugal
        ArrayList<Jugador> jugadoresPor = new ArrayList<>();
        jugadoresPor.add(new Delantero("Cristiano",    39,  7, 91, 58, 88, "Delantero", 87));
        jugadoresPor.add(new Delantero("Bruno F.",     29, 10, 84, 46, 80, "Delantero", 81));
        jugadoresPor.add(new Delantero("Leao",         24,  8, 80, 40, 78, "Delantero", 79));
        jugadoresPor.add(new Delantero("Joao Felix",   24,  9, 75, 37, 73, "Delantero", 74));
        jugadoresPor.add(new Arquero  ("Costa",        31,  1, 84, 74, 80, 17, "Arquero"));
        equipos.add(new Equipo("Portugal", "Lisboa", 0, 0, jugadoresPor));

// Inglaterra
        ArrayList<Jugador> jugadoresIng = new ArrayList<>();
        jugadoresIng.add(new Delantero("Bellingham",   20, 10, 87, 44, 83, "Delantero", 84));
        jugadoresIng.add(new Delantero("Saka",         22,  7, 82, 40, 80, "Delantero", 81));
        jugadoresIng.add(new Delantero("Foden",        23,  8, 79, 38, 77, "Delantero", 78));
        jugadoresIng.add(new Delantero("Rashford",     26,  9, 75, 36, 73, "Delantero", 74));
        jugadoresIng.add(new Arquero  ("Pickford",     30,  1, 83, 72, 79, 18, "Arquero"));
        equipos.add(new Equipo("Inglaterra", "Londres", 0, 0, jugadoresIng));

        return equipos;
    }

    public static ArrayList<Equipo> MostrarJugadores(ArrayList<Equipo> equipos, String nombreEquipo){
        boolean encontrado = false;

        for(int i=0; i<equipos.size(); i++){
            if(equipos.get(i).getNombre().equalsIgnoreCase(nombreEquipo)){
                encontrado = true;
                System.out.println("=== JUGADORES DE " + equipos.get(i).getNombre().toUpperCase() + " ===");

                ArrayList<Jugador> jugadores = equipos.get(i).getJugadores();
                for(int j = 0; j < jugadores.size(); j++){
                    System.out.println((j+1) + ". " + jugadores.get(j).getNombre()
                            + " | Edad: " + jugadores.get(j).getEdad());
                }
                break;

            }

            if(!encontrado){
                System.out.println("Equipo no encontrado");
            }


        }




        return equipos;

    }
}
