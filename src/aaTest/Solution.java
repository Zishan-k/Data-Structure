package aaTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    //Valid parenthesis eg: (){}[] - valid / (){[] - invalid
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(stack.isEmpty() || s.charAt(i) != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}
