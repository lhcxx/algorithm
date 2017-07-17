import java.util.ArrayList;
import java.util.List;

/**
 * Created by hlu24 on 7/17/2017.
 */
public class GetKthPermutation {
    public String getKthPermutation(int n, int k){
        int[] array = new int[n];
        array[0] = 1;
        for (int i = 1; i < n; i++)
            array[i] = array[i - 1] * i;
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++)
            nums.add(i);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            int rank = (k - 1) / array[n-i-1];
            k = (k -1)%array[n - i -1] + 1;
            sb.append(nums.get(rank));
            nums.remove(nums.get(rank));
        }
        return sb.toString();
    }
}
