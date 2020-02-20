package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Nokia1100 extends PreNokia1100 {
    private String nameOfTheClass = "Nokia1100";
    private int x = 0;
    private List<PhotoGallery> galleries = new ArrayList<>();

    public Nokia1100(int x) {
        this.x = x;
    }

    @Override
    public void display() {

    }

    @Override
    public void makeCall() {

    }

    public void photoGallery(PhotoGallery gallery) {
        galleries.add(gallery);
    }


    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */

}
