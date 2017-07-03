import java.util.Vector;


public class SearchInRotatedSortedArray {
    public static int search2 (Vector<Integer> array, int K) {
        int start = 0;
        int end = array.size() - 1;
        while(start < end) {
            int mid = (end - start) / 2;
            if (array.get(mid).equals(K))
                return mid;
            if (array.get(mid) > array.get(start)){
                if ( array.get(mid) >= K && array.get(start) < K)
                    end = mid;
                else
                    start = mid +1 ;
            } else if (array.get(mid) < array.get(start)){
                if ( array.get(mid) < K && array.get(end) >= K)
                    start = mid + 1;
                else
                    end = mid;
            } else
                start++;
        }
        return -1;
    }

    public static int search1(Vector<Integer> array, int K) {
        int start = 0;
        int end = array.size() - 1;
        while(start < end) {
            int mid = (end - start) / 2;
            if (array.get(mid).equals(K))
                return mid;
            if (array.get(mid) > array.get(start)){
                if ( array.get(mid) > K && array.get(start) < K)
                    end = mid;
                else
                    start = mid +1 ;
            } else {
                if ( array.get(mid) < K && array.get(end) > K)
                    start = mid + 1;
                else
                    end = mid;
            }
        }
        return -1;
    }
}
