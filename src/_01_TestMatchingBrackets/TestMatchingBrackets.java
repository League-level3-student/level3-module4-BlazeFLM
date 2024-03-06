package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {

    	Stack<Character> chars = new Stack<Character>();
    	
    	for(Character c : b.toCharArray()) {
    		if(c == '{') {
    			chars.push('{');
    		} else if (c == '}') {
    			if(chars.isEmpty()) {
    				return false;
    			} else {
    				chars.pop();
    			}
    		}
    	}
    	
    	if(chars.isEmpty()) {
    		return true;
    	}
    	
        return false;
    }
}


// for(every character c in b)
//		if c is open bracket
//			push open bracket to stack 
//		else if c is closed bracket
//			if stack is empty 
//				return false
// 			else
//				pop