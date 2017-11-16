package com.calc;

import java.util.Comparator;

/**
 * Created by Artsiom_Halavach1 on 11/15/2017.
 */
public class VowelsCountComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        int o1Count = (o1.length() - o1.replaceAll("a|e|i|o|u|y", "").length());
        int o2Count = (o2.length() - o2.replaceAll("a|e|i|o|u|y", "").length());
        if (o1Count > o2Count)
            return 1;
        if(o1Count < o2Count)
            return -1;
        return 0;
    }

}
