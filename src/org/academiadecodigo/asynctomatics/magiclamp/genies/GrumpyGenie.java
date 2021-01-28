package org.academiadecodigo.asynctomatics.magiclamp.genies;

import org.academiadecodigo.asynctomatics.magiclamp.genies.Genie;

public class GrumpyGenie extends Genie {

    public GrumpyGenie(int numberMaxWishes) {

        super(numberMaxWishes);
    }

    // need to change the number of allowed granted wishes
    @Override
    public boolean hasWishesToGrant() {

        return getWishesGranted() == 0;
    }
}
