/** Menu è un Invoker per il design pattern Command. */
public class Menu {
    private Command command;

    /** Riceve il Command su cui fare le chiamate. */
    public Menu(Command cmd) {
        command = cmd;
    }

    /** Riceve il Command su cui fare le chiamate. */
    public void setCommand(Command cmd) {
        command = cmd;
    }

    public void onClick() {
        command.execute();
    }

    public void onClickUndo() {
        command.unexecute();
    }
}