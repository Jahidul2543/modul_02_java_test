package inheritance;

public class Nokia1100 extends PreNokia1100 {
String nameOfTheClass ;
	
    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */

public static void main(String[] args) {
	Nokia1100 nokia = new Nokia1100();
	
	Nokia1100 nokia2=new Nokia1100(10);
	Nokia1100 nokia3=new Nokia1100("Nokia1100");
	System.out.println(nokia3.nameOfTheClass);
	nokia.photoGallery();
}
public void photoGallery() {
	System.out.println("add photo");
}
@Override
public void makeCall() {
System.out.println("Calling");		
}

public Nokia1100() {

}
public Nokia1100(int x) {

}
public Nokia1100(String nameOfTheClass) {
this.nameOfTheClass =nameOfTheClass;
}
   }
