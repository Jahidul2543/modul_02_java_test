package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {
    String nameOfTheClass;
    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     * */
    public abstract void display();
}
    class Ahad extends PreNokia1100{
    public void display(){
        System.out.println("this makes display colorful");
    }


    public void sendText() {
        System.out.println("this will send text");

    }

    public void makeCall(){
        System.out.println("this will make calls");

    }
    public void contactList(){
        System.out.println("his will show contact lists");

    }

}
