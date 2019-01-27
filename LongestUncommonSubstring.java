public class LongestUncommonSubstring {
    public static void main(String[] args){
        int[] bold = new int[500];
        String a = "abababc";
        String b = "ab";
//        for(int i = 0; i < a.length(); i++){
//            int prev = a.indexOf(b,  i);
//            if(prev != -1){
//                i = prev;
//                System.out.println(i);
//            } else {
//                break;
//            }
//        }

        for(int i = 0; i < a.length(); i++){
            i = a.indexOf(b, i);
            if(i != -1){
                System.out.println(i + " ");
            } else {
                break;
            }
        }
    }
}
