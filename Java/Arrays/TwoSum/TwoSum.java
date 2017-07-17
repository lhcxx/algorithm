import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Vector<Integer> test = new Vector<>();
        test.add(2);
        test.add(7);
        test.add(11);
        test.add(15);
        Vector<Integer> res = twoSum2(test, 22);
        System.out.print(res);
    }

    public static Vector<Integer> twoSum(Vector<Integer> nums, int K) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        Vector<Integer> res = new Vector<>();
        int key = 0;
        for (int i = 0; i < nums.size(); i++)
            hash.put(i, nums.get(i));
        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if( hash.containsValue( K - entry.getValue())) {
                key = K - entry.getValue();
                res.add(entry.getKey());
                break;
            }
        }
        for (Map.Entry<Integer,Integer> entry : hash.entrySet()) {
            if (entry.getValue() == key)
                res.add(entry.getKey());
        }
        return res;
    }

    public static Vector<Integer> twoSum2(Vector<Integer> nums, int K) {
        Vector<Integer> res = new Vector<>();
        Collections.sort(nums);
        int i = 0, j = nums.size() - 1;
        while(i < j) {
            if((nums.get(i) + nums.get(j)) == K){ res.add(i); res.add(j); break;}
            i++;
            if((nums.get(i) + nums.get(j)) == K){ res.add(i); res.add(j); break;}
            j--;
        }
        return res;
    }
}
