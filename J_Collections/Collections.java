package J_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

    public static ArrayList<Integer> revert(Integer[] ar) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(ar));
        java.util.Collections.reverse(list);
        return list;
    }
}
