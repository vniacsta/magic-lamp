package org.academiadecodigo.asynctomatics.magiclamp;

import org.academiadecodigo.asynctomatics.magiclamp.genies.Genie;

public class Main {

    public static void main(String[] args) {

        // create a magic lamp with a max number of genies
        MagicLamp goldLamp = new MagicLamp(4);

        // actions to run my program
        // creating an array of genies with 5 positions
        Genie[] genies = new Genie[5];

        // iterate through my genies for each of them to rub the lamp
        // it return a type of genie and populated my genie array with 5 genies
        for (int i = 0; i < genies.length; i++) {
            genies[i] = goldLamp.rubLamp();
        }

        // and then my genies will grant me 2 wishes, one at a time
        for (Genie genie : genies) {
            System.out.println("\n **** Rubbing Lamp ****");
            genie.grantWish();
            genie.grantWish();
            genie.grantWish();
        }

        System.out.println("\n **** Recharging a lamp with a demon ****");

        goldLamp.rechargeLamp(genies[4]);
        goldLamp.rechargeLamp(genies[4]);


        System.out.println("\n **** Creating a new lamp ****");

        //creating a new lamp
        MagicLamp foreverLamp = new MagicLamp(5);

        System.out.println("\n **** Comparing lamps ****");

        // comparing magic lamps
        System.out.println("Are both lams the same? " +
                foreverLamp.compareLamps(goldLamp) + "!");
    }
}
