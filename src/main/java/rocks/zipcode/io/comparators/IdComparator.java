package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare(Item first, Item second) {
        long difference = Math.subtractExact(first.getId(), second.getId());
        if (difference < 0) return -1;
        else if (difference > 0) return 1;
        return 0;
    }


}
