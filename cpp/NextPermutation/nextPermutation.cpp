#include<vector>

using namespace std;

class NextPermutation {
public:
	void nextPermutation(vector<int> &nums) {
		size_t len = nums.size();
		if (len == 0 | len == 1)  return;
		int firstBreakNum = -1;
		size_t firstBreakIndex = -1;
		for (size_t i = len; i > 1; i--) {
			if (nums[i - 1] > nums[i - 2]) {
				firstBreakNum = nums[i - 2];
				firstBreakIndex = i - 2;
				break;
			}
		}
		if (firstBreakNum == -1) {
			reverse(nums.begin(), nums.end());
			return;
		}

		for (size_t i = len; i > 1; i--) {
			if (nums[i - 1] > firstBreakNum)
				swap(nums[i - 1], firstBreakNum);
			break;
		}
		auto iter = nums.begin();
		for (size_t i = 0; i < firstBreakIndex++; i++)
			iter++;
		reverse(iter, nums.end());
	}
};