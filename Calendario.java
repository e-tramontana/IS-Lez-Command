import java.util.HashMap;
import java.util.Map;

/** Calendario è un Receiver per il design pattern Command. */
public class Calendario {
    private final Map<String, String> calend = new HashMap<>();

    public boolean aggiungi(String event, String time) {
        System.out.println("[Calendario] aggiungi");
        if (calend.putIfAbsent(time, event) != null)
            return false;
        return true;
    }

    public void rimuovi(String time) {
        System.out.println("[Calendario] rimuovi");
        calend.remove(time);
    }

    public void stampa() {
        System.out.println("[Calendario] stampa");
        calend.keySet().stream().sorted().forEach(e -> System.out.println(e + " " + calend.get(e)));
    }
}
