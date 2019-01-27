public class Hexa {
    public static void main(String[] args){
        int a = Integer.parseInt("0f", 16);
//        a++;
//        System.out.println(a);
//        System.out.println(a/10);
//        System.out.println(Integer.toString(a/16,16));
        System.out.println(a/16 == a%16);
        System.out.println(Integer.toString(a, 16));
        System.out.println(String.format("%02x", a));
    }
}
