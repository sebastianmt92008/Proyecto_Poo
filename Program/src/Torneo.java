import java.util.ArrayList;

public class Torneo {
    public ArrayList<Equipo> InicializarEquipos(){
        ArrayList<Equipo> equipos = new ArrayList<>();

        ArrayList<Jugador> jugadoresCol = new ArrayList<>();
        jugadoresCol.add(new Delantero("James Rodriguez",    32, 10, 95, 0, 88, "Delantero", 85));
        jugadoresCol.add(new Delantero("Falcao Garcia",      37,  9, 80, 0, 78, "Delantero", 80));
        jugadoresCol.add(new Delantero("Luis Diaz",          26,  7, 85, 0, 82, "Delantero", 83));
        jugadoresCol.add(new Delantero("Cuadrado",           35,  8, 70, 0, 70, "Delantero", 72));
        jugadoresCol.add(new Arquero  ("David Ospina",       35,  1, 88, 0, 80, 0, "Arquero"));
        equipos.add(new Equipo("Colombia", "Barranquilla", 0, 0, 0, 0,0, jugadoresCol));

        ArrayList<Jugador> jugadoresBra = new ArrayList<>();
        jugadoresBra.add(new Delantero("Vinicius Jr",  23, 10, 97, 0, 90, "Delantero", 92));
        jugadoresBra.add(new Delantero("Neymar",       31,  9, 88, 0, 87, "Delantero", 88));
        jugadoresBra.add(new Delantero("Rodrygo",      22,  7, 82, 0, 80, "Delantero", 81));
        jugadoresBra.add(new Delantero("Richarlison",  26,  8, 75, 0, 73, "Delantero", 74));
        jugadoresBra.add(new Arquero  ("Alisson",      31,  1, 92, 0, 90, 0, "Arquero"));
        equipos.add(new Equipo("Brasil", "Sao Paulo", 0, 0, 0, 0,0, jugadoresBra));

// Argentina
        ArrayList<Jugador> jugadoresArg = new ArrayList<>();
        jugadoresArg.add(new Delantero("Messi",        36, 10, 99, 0, 95, "Delantero", 95));
        jugadoresArg.add(new Delantero("Lautaro",      26,  9, 87, 0, 83, "Delantero", 84));
        jugadoresArg.add(new Delantero("Di Maria",     35,  7, 78, 0, 78, "Delantero", 79));
        jugadoresArg.add(new Delantero("Alvarez",      24,  8, 75, 0, 72, "Delantero", 73));
        jugadoresArg.add(new Arquero  ("E. Martinez",  31,  1, 93, 0, 92,  0, "Arquero"));
        equipos.add(new Equipo("Argentina", "Buenos Aires", 0, 0, 0, 0, 0, jugadoresArg));

// Francia
        ArrayList<Jugador> jugadoresFra = new ArrayList<>();
        jugadoresFra.add(new Delantero("Mbappe",       25, 10, 96, 0, 92, "Delantero", 93));
        jugadoresFra.add(new Delantero("Griezmann",    32,  9, 83, 0, 80, "Delantero", 81));
        jugadoresFra.add(new Delantero("Dembele",      26,  7, 80, 0, 78, "Delantero", 79));
        jugadoresFra.add(new Delantero("Giroud",       37,  8, 72, 0, 70, "Delantero", 71));
        jugadoresFra.add(new Arquero  ("Maignan",      28,  1, 89, 0, 86, 0, "Arquero"));
        equipos.add(new Equipo("Francia", "Paris", 0, 0, 0, 0, 0,  jugadoresFra));

// Alemania
        ArrayList<Jugador> jugadoresAle = new ArrayList<>();
        jugadoresAle.add(new Delantero("Kane",         30, 10, 90, 0, 87, "Delantero", 88));
        jugadoresAle.add(new Delantero("Muller",       34,  9, 78, 0, 75, "Delantero", 76));
        jugadoresAle.add(new Delantero("Gnabry",       28,  7, 76, 0, 74, "Delantero", 75));
        jugadoresAle.add(new Delantero("Havertz",      24,  8, 73, 0, 70, "Delantero", 71));
        jugadoresAle.add(new Arquero  ("Neuer",        37,  1, 88, 0, 88, 0, "Arquero"));
        equipos.add(new Equipo("Alemania", "Berlin", 0, 0, 0, 0, 0,  jugadoresAle));

// España
        ArrayList<Jugador> jugadoresEsp = new ArrayList<>();
        jugadoresEsp.add(new Delantero("Yamal",        16, 10, 88, 0, 90, "Delantero", 86));
        jugadoresEsp.add(new Delantero("Morata",       31,  9, 78, 0, 74, "Delantero", 75));
        jugadoresEsp.add(new Delantero("Olmo",         25,  7, 76, 0, 73, "Delantero", 74));
        jugadoresEsp.add(new Delantero("Williams",     21,  8, 74, 0, 71, "Delantero", 72));
        jugadoresEsp.add(new Arquero  ("Unai Simon",   27,  1, 85, 0, 82, 0, "Arquero"));
        equipos.add(new Equipo("España", "Madrid", 0, 0,0, 0, 0, jugadoresEsp));

// Portugal
        ArrayList<Jugador> jugadoresPor = new ArrayList<>();
        jugadoresPor.add(new Delantero("Cristiano",    39,  7, 91, 0, 88, "Delantero", 87));
        jugadoresPor.add(new Delantero("Bruno F.",     29, 10, 84, 0, 80, "Delantero", 81));
        jugadoresPor.add(new Delantero("Leao",         24,  8, 80, 0, 78, "Delantero", 79));
        jugadoresPor.add(new Delantero("Joao Felix",   24,  9, 75, 0, 73, "Delantero", 74));
        jugadoresPor.add(new Arquero  ("Costa",        31,  1, 84, 0, 80, 0, "Arquero"));
        equipos.add(new Equipo("Portugal", "Lisboa", 0, 0, 0, 0, 0, jugadoresPor));

// Inglaterra
        ArrayList<Jugador> jugadoresIng = new ArrayList<>();
        jugadoresIng.add(new Delantero("Bellingham",   20, 10, 87, 0, 83, "Delantero", 84));
        jugadoresIng.add(new Delantero("Saka",         22,  7, 82, 0, 80, "Delantero", 81));
        jugadoresIng.add(new Delantero("Foden",        23,  8, 79, 0, 77, "Delantero", 78));
        jugadoresIng.add(new Delantero("Rashford",     26,  9, 75, 0, 73, "Delantero", 74));
        jugadoresIng.add(new Arquero  ("Pickford",     30,  1, 83, 0, 79, 0, "Arquero"));
        equipos.add(new Equipo("Inglaterra", "Londres", 0, 0, 0, 0, 0, jugadoresIng));

        return equipos;
    }
}
