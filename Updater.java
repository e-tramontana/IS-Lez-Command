import java.util.Stack;

/** Updater è un ConcreteCommand per il design pattern Command. */
public class Updater implements Command {
    private Calendario cal;
    private String attiv;
    private Stack<String> timestamps = new Stack<>();
    private int counterL = 1;
    private int counterR = 1;

    public Updater(Calendario receiver, String attivita) {
        cal = receiver;
        attiv = attivita;
    }

    /**
     * In base all'attività, determina i parametri da passare e il metodo da
     * chiamare.
     */
    @Override
    public void execute() {
        if (attiv.equals("lavoro")) {
            String time = String.valueOf(counterL + 9) + ":00";
            if (cal.aggiungi("Lezione " + String.valueOf(counterL), time))
                timestamps.push(time);
            counterL++;
        } else if (attiv.equals("riposo")) {
            String time = String.valueOf(counterR + 9) + ":50";
            if (cal.aggiungi("Riposo " + String.valueOf(counterR), time))
                timestamps.push(time);
            counterR++;
        } else
            cal.stampa();
    }

    @Override
    public void unexecute() {
        if (!timestamps.empty())
            cal.rimuovi(timestamps.pop());
    }
}
