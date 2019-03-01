package crossover;

import base.Tour;
import crossover.OrderCrossover;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import static org.junit.Assert.assertTrue;

public class TestOrderCrossover {
    @Test
    public void doCrossover() {

        OrderCrossover maskedCrossover = new OrderCrossover();

        Tour tour2 = new Tour();
        Tour tour1 = new Tour();

        ArrayList<Tour> tours = new ArrayList<>();
        tours = maskedCrossover.doCrossover(tour1,tour2);

        assertTrue(tours.size()==2);
        assertTrue(maskedCrossover.doCrossover(tour1,tour2) != null);

        LinkedHashSet hashSet = new LinkedHashSet();

        hashSet.addAll(tours);

        assertTrue(hashSet.size()==tours.size());
    }
}
