import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Javalec {
    public static void main(String[] args) {
        Integer[] que = {8, 4, 10, 9, 2};


        Arrays.sort(que, Collections.reverseOrder());


//        for (int i = 0; i < que.length; i++) {
//            for (int j = i + 1; j < que.length; j++) {
//                if (que[i] < que[j]) {
//                    int temp = que[i];
//                    que[i] = que[j];
//                    que[j] = temp;
//                }
//            }
//
//        }


        for (int k = 0; k < que.length; k++) {
            System.out.println(que[k]);
        }

        // expect [10, 9, 8, 4,2]
    }
}
