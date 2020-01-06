package inheritance;

public abstract class Nokia1100 extends PreNokia1100 {
   public static void main(String[] args) {
      String nameOfTheClass;
      Nokia1100 nokia = new Nokia1100() {
         public void sendText() {

         }

         public void makeCall() {

         }

         public void contactList() {

         }

         public void display() {

         }

         protected void photoGallery() {

         }
      };

      Nokia1100 nokia2= new Nokia1100(10) {
         public void sendText() {

         }

         public void makeCall() {

         }

         public void contactList() {

         }

         public void display() {

         }

         protected void photoGallery() {

         }
      };
      Nokia1100 nokia3= new Nokia1100("Nokia1100") {
         public void sendText() {

         }

         public void makeCall() {

         }

         public void contactList() {

         }

         public void display() {

         }

         protected void photoGallery() {

         }
      };
      System.out.println(nokia3.nameOfTheClass);
      nokia.photoGallery();


      /**
       * Make necessary changes to inherit PreNokia1100
       * Declare and assign value to a String instance variable called nameOfTheClass
       * Implement a method to add photo gallery photoGallery()
       * Create default constructor and a parameterized constructor with int x parameter
       * */

   }

   protected abstract void photoGallery();

   public void addphoto(){
      System.out.println("add photo");
   }

     public Nokia1100 (){

   }
   public Nokia1100(int x){

   }
   public Nokia1100(String nameOfTheclass){
      this.nameOfTheClass=nameOfTheclass;
   }
}