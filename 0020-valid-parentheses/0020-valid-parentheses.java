class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < s.length(); i++) {
            char y = s.charAt(i);
 
            if (y == '(' || y == '[' || y == '{') {
                // Push the element in the stack
                stack.push(y);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (y) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
}