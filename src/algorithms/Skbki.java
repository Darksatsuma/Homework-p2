package algorithms;

import java.util.*;

/**
 * Created by asus pc on 08.04.2017.
 */
public class Skbki {
    public static void main(String[] args) {
        String s;
        char c;
        java.util.Stack<Character> stack = new java.util.Stack();
        Scanner in = new Scanner(System.in);
        s = in.next();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                stack.push(c);
            } else {
                try {
                    switch (c) {
                        case '"':
                            if (c == stack.peek()) {
                                stack.pop();
                            } else stack.push(c);
                            break;
                        case ')':
                            if (stack.pop() != '(') {
                                throw new Exception();
                            }
                            break;
                        case '>':
                            if (stack.pop() != '<') {
                                throw new Exception();
                            }
                            break;
                        case '}':
                            if (stack.pop() != '{') {
                                throw new Exception();
                            }
                            break;
                        case ']':
                            if (stack.pop() != '[') {
                                throw new Exception();
                            }
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
