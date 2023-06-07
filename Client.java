/**
 * Per il design pattern Command, il Client crea il ConcreteCommand Updater e
 * imposta il Receiver Calendario sul ConcreteCommand Updater.
 */
public class Client {
    // Il Receiver è sempre la stessa istanza di Calendario
    private final Calendario cal = new Calendario();

    /** Imposta un nuovo ConcreteCommand e l'attività sul Receiver Calendario. */
    public Command registra(String attiv) {
        return new Updater(cal, attiv);
    }
}
