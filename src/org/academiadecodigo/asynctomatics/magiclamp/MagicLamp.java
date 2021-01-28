package org.academiadecodigo.asynctomatics.magiclamp;

import org.academiadecodigo.asynctomatics.magiclamp.genies.FriendlyGenie;
import org.academiadecodigo.asynctomatics.magiclamp.genies.Genie;
import org.academiadecodigo.asynctomatics.magiclamp.genies.GrumpyGenie;
import org.academiadecodigo.asynctomatics.magiclamp.genies.RecyclableDemon;

public class MagicLamp {

    private int maxNumGenies;
    // check how many times rubLamp has run
    private int countRubs;
    // check how many times has recharged
    private int countRecharge;

    public MagicLamp(int maxNumGenies) {
        this.maxNumGenies = maxNumGenies;
        this.countRubs = 0;
        this.countRecharge = 0;
    }

    // when lamp is "enchanted", it creates new genies
    // method to release a new genie every time it is rubbed
    public Genie rubLamp() {

        System.out.println(" ** Rubbing Lamp **");
        // counter to check odd or even number
        countRubs++;
        // decrease the number of genies every time goes through this loop
        maxNumGenies--;

        // if there are no more genies, the recyclable demon is released
        // start with exception
        if (maxNumGenies < 1) {
            return new RecyclableDemon(4);

        } else {
            // if number max of genies is greater than 0, do this:
            // if number max of genies is at an odd number = grumpy, else friendly
            if (countRubs % 2 == 0) {
                return new FriendlyGenie(3);
            } else {
                return new GrumpyGenie(5);
            }
        }
    }

    // once demon is released, it will recharge the lamp
    public void rechargeLamp(Genie genie) {

        // make sure only happens with the RecyclableDemon
        if (!(genie instanceof RecyclableDemon)) {
            return;
        }

        // call a cast to force the genie to be a recyclable demon
        RecyclableDemon demon = (RecyclableDemon) genie;

        // because I saved a RecyclableDemon in the variable demon, I can call the method in the
        // subclass - if the demon is recycled I cannot use it again
        if (demon.isRecycled()) {
            System.out.println(demon + " was already recycled.");
            return;
        }

        // call the method recycle to change the value
        demon.recycle();
        countRecharge++;
        // rest the counter
        countRubs = 0;
        System.out.println("The magic lamp is recharged by a " + demon);
    }
}
