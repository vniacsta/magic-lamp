package org.academiadecodigo.asynctomatics.magiclamp.genies;

public class Genie {

    private int numberMaxWishes;
    private int wishesGranted;

    // constructor for Genie super class
    public Genie(int numberMaxWishes) {
        this.numberMaxWishes = numberMaxWishes;
        this.wishesGranted = 0;
    }

    // method to grant wish common to all subclasses
    public void grantWish() {

        System.out.println("** Granting wishes **");

        // if number max of wishes is inferior to
        if (!hasWishesToGrant()) {
            System.out.println(this + " won't grant you more wishes.");
            return;
        }
        // if there are still wishes print and increment
        System.out.println(this + " has granted your wish!");
        wishesGranted++;
    }

    // extract this logic from grantWish to override just this condition on other classes
    public boolean hasWishesToGrant() {
        return wishesGranted < numberMaxWishes;
    }

    // getter
    public int getWishesGranted() {
        return wishesGranted;
    }

    // to print the name of the class - each genie name
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
