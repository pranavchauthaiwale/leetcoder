import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TwoSum {

    public static void main(String[] args)
    {
        List<Integer> myList = new ArrayList<>();
        myList.add(23);
        for(int i = 0; i < 10; i++){
            myList.add(i * 5 - 3);
        }
        for(Integer key : myList){
            System.out.println(key);
        }
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        Stack<Integer> stack = new Stack<>();
    }
}
