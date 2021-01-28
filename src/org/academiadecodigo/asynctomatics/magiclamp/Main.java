package org.academiadecodigo.asynctomatics.magiclamp;

import org.academiadecodigo.asynctomatics.magiclamp.genies.Genie;

public class Main {

    public static void main(String[] args) {

        // create a magic lamp with a max number of genies
        MagicLamp myLamp = new MagicLamp(4);

        // actions to run my program
        // creating an array of genies with 5 positions
        Genie[] genies = new Genie[5];

        // iterate through my genies for each of them to rub the lamp
        // it return a type of genie and populated my genie array with 5 genies
        for (int i = 0; i < genies.length; i++) {
            genies[i] = myLamp.rubLamp();
        }

        // and then my genies will grant me 2 wishes, one at a time
        for (Genie genie : genies) {
            genie.grantWish();
            genie.grantWish();
            genie.grantWish();
            genie.grantWish();
        }

        System.out.println("** Rechargind a lamp with a demon **");

        myLamp.rechargeLamp(genies[4]);
        myLamp.rechargeLamp(genies[2]); // cannot work - it's not a demon type

    }
}
