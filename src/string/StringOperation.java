package string;

public class StringOperation {
    public static void main(String[] args) {
        String city = "Martapura";

        System.out.println(city);

        char[] namaChar = { 'M','U','H','A','M','M','A','D' };
        String namaString = new String(namaChar);
        System.out.println(namaString);

        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.substring(0,5));
        System.out.println(city.substring(5));
    }
}
