import java.util.ArrayList;
import java.util.List;

public class Cluedo {
    public static void main(String[] args) {
        String personajesArray[] = { "Amapola", "Celeste", "Prado", "Mora", "Rubio", "Blanco" };
        String armasArray[] = { "bate", "pistola", "candelabro", "cuchilla", "cuerda", "hacha", "pesa", "veneno" };
        String habitacionesArray[] = { "casa de invitados", "teatro", "spa", "observatorio", "comedor", "terraza",
                "cocina", "salon", "vestibulo" };
        Jugador jugador = new Jugador();
        jugador.setNombre(personajesArray[3]);
        jugador.setArma(armasArray[4]);
        jugador.setHabitacion(habitacionesArray[2]);
        jugador.setHorapartida();
        System.out.println(jugador);
        List<Jugador> estadosJugador = new ArrayList<Jugador>();
        estadosJugador.add(jugador);
        System.out.println(estadosJugador.get(0));

        for (int i = 0; i < 5; i++) {
            jugador=new Jugador();
            jugador.setNombre(personajesArray[i]);
            jugador.setArma(armasArray[i]);
            jugador.setHabitacion(habitacionesArray[i]);
            jugador.setHorapartida();
            estadosJugador.add(jugador);

        }
        for(int j = 0;j<estadosJugador.size();j++){
            
            System.out.println(estadosJugador.get(j));
        }
    }
}