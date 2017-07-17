import java.util.Vector;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        Vector<Integer> test1 = new Vector<>();
        test1.add(1);
        test1.add(3);
        test1.add(5);
        test1.add(7);
        test1.add(9);
        Vector<Integer> test2 = new Vector<>();
        test2.add(2);
        test2.add(4);
        test2.add(6);
        test2.add(8);
        test2.add(10);
        System.out.println(findKthOfTwoSortedArrays(test1, test2, 5));
    }

    public static int findKthOfTwoSortedArrays(Vector<Integer> array_a, Vector<Integer> array_b, int K) {
        int k = 1;
        for (int i = 0, j = 0; i <= array_a.size() - 1 && j <= array_b.size() - 1; ++k){
            if (array_a.get(i) <= array_b.get(j)) {
                i++;
                if (k == K ) return array_a.get(i - 1);
            } else {
                j++;
                if (k == K) return array_b.get(j - 1);
            }
        }
        return -1;
    }


}
