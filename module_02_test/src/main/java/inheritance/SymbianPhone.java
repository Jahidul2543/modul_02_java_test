package inheritance;

public interface SymbianPhone {

    /**
     *
     * Assume that this is early stage of creating mobile
     *
     * Declare 3 methods sendText(), makeCall(), contactList()
     * Can a method contains method body in Interface?
     * Ans:NO
     *
     * */

    public abstract void sendText();

    public abstract void makeCall();

    public abstract void contactList();
}
