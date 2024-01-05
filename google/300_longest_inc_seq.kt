fun lengthOfLIS(nums: IntArray): Int {
    //This is the bottom up approach, technically most optimal and the array could be changed to 1D
    var size = nums.size;
    val dp = Array(size + 1) { IntArray(size + 1) { 0 } };
    for (curr in size - 1 downTo 0) {
        for (prev in curr - 1 downTo -1) {
            var length = dp[curr + 1][prev + 1];
            //prev is negative at the end of the array
            // if 'prev' is negative or prev value < than the next value then we take it
            if (prev < 0 || nums[prev] < nums[curr]) {
                length = maxOf(length, 1 + dp[curr + 1][curr + 1]);
            }
            dp[curr][prev + 1] = length;
        }
    }
    return dp[0][0];
}

fun lengthOfLISDp(nums: IntArray): Int {
    var length = nums.size;
    val dp = Array(length + 1) { IntArray(length + 2) { -1 } }
    return lengthRec(nums, 0, -1, dp);
}

fun lengthRec(nums: IntArray, curr: Int, prev: Int, dp: Array<IntArray>): Int {
    //base case, if we are the end of the array, return 0 as the longest length
    if (curr == nums.size) return 0;
    //if we have stored the result already, use that result
    if (dp[curr][prev + 1] != -1) return dp[curr][prev + 1];

    //solving the first subproblem (is the current branch the best one?)
    var length = lengthRec(nums, curr + 1, prev, dp);

    //solving the second subproblem (can we find a better one by ignoring this result?)
    if (prev < 0 || nums[prev] < nums[curr]) {
        length = maxOf(length, 1 + lengthRec(nums, curr + 1, curr, dp));
    }

    dp[curr][prev + 1] = length; //store the result of the current subproblem we are solving

    return dp[curr][prev + 1];
}

/* Given the input array is already sorted, binary search is the optimal result, the java code is below
    You should rewrite this in Kotlin when you review LIS
* */

/*
 public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > sub.get(sub.size() - 1)) {
                sub.add(num);
            } else {
                int j = binarySearch(sub, num);
                sub.set(j, num);
            }
        }

        return sub.size();
    }

    private int binarySearch(ArrayList<Integer> sub, int num) {
        int left = 0;
        int right = sub.size() - 1;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;
            if (sub.get(mid) == num) {
                return mid;
            }

            if (sub.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

 */