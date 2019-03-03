package mutation;

import base.Tour;

public abstract class Mutation implements IMutation {
    public static Mutation DM;
    public static Mutation EM;


    public abstract void doMutation(Tour tour);

    public String toString() {
        return getClass().getSimpleName();
    }
}
