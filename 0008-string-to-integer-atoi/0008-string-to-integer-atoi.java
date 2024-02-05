class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        
        if(s == null || s.length() == 0) {
            return 0;
        }
        
        double result = 0;
        boolean isNegative = false;
        int startIndex = 0;
        
        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            ++startIndex;
        }
        
        if(s.charAt(0) == '-') {
            isNegative = true;
        }
        
        for(int i = startIndex; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') { 
                break;
            }
            int digitValue = (int)(s.charAt(i) - '0');
            result = result*10 + digitValue;
        }
        
        if(isNegative) {
            result = -result;
        }
        
        if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}