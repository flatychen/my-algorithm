package flaty.codility.missingInteger;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> array = IntStream.of(A).boxed().filter(value -> value>0).distinct().sorted().collect(Collectors.toList());
        if (array.size() == 0) {
            return 1;
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).intValue() != i+1) {
                return i + 1;
            }
        }

        return array.size()+1;
    }

}

