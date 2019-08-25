package com.yuli;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * #20
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                stack.push(c);
            }else if(stack.isEmpty() || map.get(c) != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean valid = validParentheses.isValid("[())]");
        System.out.println(valid);
    }
}
