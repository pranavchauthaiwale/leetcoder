public class atoi {
    public static void main(String[] args){
        String str = "-";
        str = str.trim();
        str = str.substring(1);
        for(char ch : str.toCharArray()){
            System.out.println((int) ch);
        }
        if(str.isEmpty()){
            System.out.println("Str is Empty");
        }
        System.out.println(str);
    }
}
