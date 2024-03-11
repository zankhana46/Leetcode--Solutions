class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        //effectively multiplies 1 by 2^n, giving us the total number of iterations the loop will perform.
        for (int i = 0; i < 1 << n; ++i) {
            ans.add(i ^ (i >> 1));
            // The XOR operation compares each bit of the first operand to the corresponding bit of the second operand
        }
        return ans;
    }
}