import java.util.Stack;

public class MagicString {
    public static void main(String[] args){
        String inputString = "aabbbcddd";
        String outputString = "Empty String";
        if(inputString.isEmpty()){
            return;
        }
        Stack stack = new Stack();
        char top;
        for(char elem : inputString.toCharArray()){

            if (stack.isEmpty()){
                stack.push(elem);
            }
            else {
                top = (char) stack.peek();
                if (elem == top){
                    stack.pop();
                }
                else {
                    stack.push(elem);
                }
            }
        }

        for (Object obj : stack.toArray()){
            System.out.println(obj);
        }
        System.out.println("here");
    }
}