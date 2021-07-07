package com.saltech.testwebatrioapi.util;

import java.util.*;

public class Util {
    /**
     * Returns a sorted iterator from an unsorted one. Use this method as a last resort,
     * since it is much less efficient then just sorting a collection that backs the
     * original iterator.
     */

    public static Iterator sortedIterator(Iterator it, Comparator comparator) {
        List list = new ArrayList();
        while (it.hasNext()) {
            list.add(it.next());
        }

        Collections.sort(list, comparator);
        return list.iterator();
    }
}
