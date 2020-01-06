package inheritance;

public interface SymbianPhone {

    /**
     *
     * Assume that this is early stage of creating mobile
     *
     * Declare 3 methods sendText(), makeCall(), contactList()
     * Can a method contains method body in Interface?
     * Ans: Before Jdk 8 s method cant contains method body in interface. From jdk 8 a method can contains method body only for static and default method.
     *
     * */

    public void sendText();

    public void makeCall();
    public void contactList();

}
