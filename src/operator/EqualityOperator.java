package operator;

public class EqualityOperator {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a==0);
        System.out.println(a==1); //false
        System.out.println(a==b); //false
        System.out.println(a<b);
        System.out.println(a>b); //false
        System.out.println(0>1); //false
        System.out.println(0<1);
        System.out.println(a!=1);
        System.out.println(b!=1); //false
    }
}
