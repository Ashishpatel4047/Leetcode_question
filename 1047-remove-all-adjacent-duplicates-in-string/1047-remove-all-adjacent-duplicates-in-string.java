class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack <>();
        for( int i = 0; i<s.length();i=i+1){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder Sb= new StringBuilder();
        while(!stack.isEmpty()){
            Sb.append(stack.pop());
        }
        Sb.reverse();
        return Sb.toString();
    }
}