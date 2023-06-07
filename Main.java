public class Main {
    private static Menu menu;

    public static void main(String[] args) {
        Client client = new Client();
        Command cmd = client.registra("lavoro");
        // registra il Command cmd sull'Invoker
        menu = new Menu(cmd);
        // simula la selezione della voce di menu
        simulaClick();
        // simula nel menu una seconda voce e l'attività da effettuare
        menu.setCommand(client.registra("riposo"));
        simulaClick();
        // simula il click della voce di menu Undo
        menu.onClickUndo();
        // simula una terza voce di menu
        menu.setCommand(client.registra("stampa"));
        menu.onClick();
    }

    /** simula alcuni click sul menu */
    private static void simulaClick() {
        menu.onClick();
        menu.onClick();
        menu.onClick();
    }
}
