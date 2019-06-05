package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        while (!isSorted(items), comparator) {
            for (int i = 0; i < items.length - 1; i++) {
                int compared = comparator.compare(items[i], items[i]);
                if (compared < 0) swap(i, i + 1); //smaller than
//            else if (compared > 0) ; //larger than
//            else ; //same size
            }
        }
        return items;
    }

    private void swap(int first, int second) {
        Item temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    private Boolean isSorted(Item[] items, Comparator<Item> comparator) {
        for (Item item : items) {
            if (comparator.compare(items[i], items[i+1]) > 0) return false;
        }
        return true;
    }

}
