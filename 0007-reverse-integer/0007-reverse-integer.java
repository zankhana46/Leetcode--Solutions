class Solution {
    public int reverse(int x) {
        int ans = 0;
      boolean isNegative = x < 0;

      // Take absolute value
      x = Math.abs(x);

      while(x > 0) {

          // Compare current answer with Integer MAX value (i.e, the maximum 32-bit integer value) without the least significant digit
          if(ans > Integer.MAX_VALUE / 10) {
              return 0;
          }

          // Deduce the reversed integer mathematically
          ans = ans * 10 + x % 10;
          x /= 10;
      }

      // Negate the answer if input is negative
      return isNegative ? -ans : ans;
    }
}