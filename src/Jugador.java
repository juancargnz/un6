import java.time.LocalTime;

public class Jugador {
    // Atriubutos
    private LocalTime horapartida;
    private String nombre;
    private String habitacion;
    private String arma;

    // constructor
    public Jugador() {
        horapartida = null;
        nombre = null;
        habitacion = null;
        arma = null;
    }

    // getters y setters
    public LocalTime getHorapartida() {
        return horapartida;
    }

    public void setHorapartida() {
        horapartida = LocalTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        jugador.setNombre("Antonio");
        jugador.setArma("Bate");
        jugador.setHabitacion("578");
        jugador.setHorapartida();
        System.out.println(jugador.getArma()+"   "+jugador.getHabitacion()+"    "+jugador.getHorapartida()+"    "+jugador.getNombre());

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[nombre: "+"    "+nombre+","+"arma:"+","+"    "+arma+"habitacion:"+","+habitacion+"   "+"Hora de partida:"+","+horapartida+"]";
    }
}
