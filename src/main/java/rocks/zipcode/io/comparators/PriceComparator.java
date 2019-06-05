package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item first, Item second) {
        if (first.getPrice() - second.getPrice() < 0) return -1;
        else if (first.getPrice() - second.getPrice() > 0) return 1;
        return 0;
    }
}
