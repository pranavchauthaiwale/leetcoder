import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    private static List<List<Integer>> combinations;

    public static void main(String[] args){
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;

        combinations = new ArrayList<>();
        combination(candidates, target);

        System.out.println("Final Combinations");
        for(List<Integer> comb : combinations){
            System.out.println(comb);
        }
    }

    public static void combination(int[] candidates, int target){
        Stack<Integer> buffer;
        Arrays.sort(candidates);
        for(int i = 0; i < candidates.length; i++) {
            System.out.println("For candidate " + candidates[i]);
            buffer = new Stack<>();
            recursiveCombinationSum(candidates, target, buffer, i);
        }
    }


    public static void recursiveCombinationSum(int[] candidates, int target,
                                               Stack<Integer> buffer, int current){
        int newTarget = target - candidates[current];
        if(newTarget == 0){
            buffer.push(candidates[current]);
            List<Integer> combination = new ArrayList<>(buffer);
            combinations.add(combination);
            buffer.pop();
        }
        else if(newTarget > 0){
            buffer.push(candidates[current]);
            System.out.println("Buffer: " + buffer);
            for(int i = current; i < candidates.length; i++){
                recursiveCombinationSum(candidates, newTarget, buffer, i);
            }
            buffer.pop();
        }
    }
}
