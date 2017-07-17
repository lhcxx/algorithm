import java.util.Vector;

public class RemoveElement {
    public static int removeElement(Vector<Integer> nums, int K) {
        int index = 0;
        for (int i = 0; i < nums.size(); i++){
            if(nums.get(i) != K) {
                nums.set(index++, nums.get(i));
            }
        }
        return index;
    }
}
