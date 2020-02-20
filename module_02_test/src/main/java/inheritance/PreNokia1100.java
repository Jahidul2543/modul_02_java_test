package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {
    private String nameOfTheClass = "PreNokia1100";

    /**
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     * <p>
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     */

    public void sendText() {

    }

    public abstract void display();

    public abstract void makeCall();

}
