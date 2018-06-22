import java.util.Stack;

public class CountAndSay {

    public static void main(String[] args){
        int n;
        n = 5;
        String val = count(n);
        System.out.println(val);
    }

    public static String count(int n){

        String seed = "";
        for(int i = 1; i <= n; i++){
            if(seed.equals("")){
                seed = "1";
            }
            else {
                char[] arr = seed.toCharArray();
                char key = arr[0];
                int count = 0;
                StringBuilder builder = new StringBuilder("");
                Stack<Character> myStack = new Stack<>();
                myStack.push(key);
                for (char ch : arr) {
                    if (ch == myStack.peek()) {
                        count++;
                    } else {
                        builder.append(count);
                        builder.append(myStack.peek());
                        myStack.push(ch);
                        count = 1;
                    }
                }
                builder.append(count);
                builder.append(myStack.peek());
                seed = builder.toString();
            }
        }
        return seed;
    }
}
