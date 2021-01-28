package org.academiadecodigo.asynctomatics.magiclamp.genies;

import org.academiadecodigo.asynctomatics.magiclamp.genies.Genie;

public class RecyclableDemon extends Genie {

    private boolean recycled;

    public RecyclableDemon(int numberMaxWishes) {
        super(numberMaxWishes);
        this.recycled = false;
    }

    // method to recycle to be called on the lamp
    public void recycle() {

        this.recycled = true;
    }

    // override the method
    @Override
    public boolean hasWishesToGrant() {
        // grants all wishes until it is recycled
        return !recycled;
    }

    // getter
    public boolean isRecycled() {

        return recycled;
    }
}
