class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        if (s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) stack.push(c);
            else if ((stack.peek()=='[' && c == ']') || (stack.peek() == '(' && c == ')') 
                || (stack.peek() == '{' && c == '}')){
                stack.pop();    
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}

/**
[Yuha]

class Solution {
    public boolean isValid(String s) {
        
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        Stack<String> stack = new Stack<>();
        stack.push(list.get(0));
        
        for (int i = 1; i < list.size(); i++) {
            String now = list.get(i);
            if (stack.isEmpty()) {
                stack.push(now);
                continue;
            }
            boolean result = checkPair(stack.peek(), now);
            if (result) stack.pop();
            else stack.push(list.get(i));
                        
        }
        
        if (stack.isEmpty()) return true;
        
        return false;
    }
    
    private boolean checkPair(String s1, String s2) {
        if (s1.equals(")") || s1.equals("}") || s1.equals("]")) return false;
        Map<String, String> brackets = Map.of("(", ")", "{", "}", "[", "]");
        if (brackets.get(s1).equals(s2)) return true;
        else return false;
    }
}
 */