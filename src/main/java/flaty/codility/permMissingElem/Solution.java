package flaty.codility.permMissingElem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        List<Integer> list = IntStream.of(a).sorted().boxed().collect(Collectors.toList());
        for (int i = 0; i < a.length; i++) {
            if (list.get(i) != (i+1)) {
                return i+1;
            }
        }
        return 0;
    }

}

