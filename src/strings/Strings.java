package strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        // Create String
        String str = "sandeep";
        System.out.println(str);

        String str2 = new String("kushwaha");
        System.out.println(str2);

        String str3 = new String();
        str3 = "abc";
        System.out.println(str3);

        // charAt method
        System.out.println(str.charAt(2));

        // length method
        System.out.println(str.length());

        // Looping through the string
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ", ");
        }
        System.out.println();

        // toCharArray method
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        // equals method
        System.out.println(str.equals(str2));

        // equalsIgnoreCase method
        System.out.println(str.equalsIgnoreCase("SANDEP"));

        // compareTo method
        System.out.println(str.compareTo(str2));

        // compareToIgnoreCase method
        System.out.println(str.compareToIgnoreCase("SANDEP"));

        // substring method
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 4));

        // concat method
        System.out.println(str.concat(str2));

        // contains method
        System.out.println(str.contains("and"));

        // startsWith and endsWith methods
        System.out.println(str.startsWith("san"));
        System.out.println(str.endsWith("ep"));

        // indexOf and lastIndexOf methods
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        // isEmpty method
        System.out.println(str.isEmpty());

        // replace method
        System.out.println(str.replace('a', 'o'));

        // trim method
        String str4 = "  whitespace  ";
        System.out.println(str4.trim());

        // split method
        String[] parts = str2.split("u");
        System.out.println(Arrays.toString(parts));

        // valueOf method
        int num = 123;
        String str5 = String.valueOf(num);
        System.out.println(str5);

        // toUpperCase and toLowerCase methods
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // format method
        String str6 = String.format("Hello, %s!", str2);
        System.out.println(str6);

        // join method
        String str7 = String.join("-", "2023", "06", "28");
        System.out.println(str7);

        // intern method
        String str8 = new String("hello").intern();
        String str9 = "hello";
        System.out.println(str8 == str9); // true

        // matches method
        System.out.println(str.matches(".*d.*"));

        // codePointAt method
        System.out.println(str.codePointAt(1));

        // split method with regex
        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));

        // getBytes method
        byte[] byteArray = str.getBytes();
        System.out.println(Arrays.toString(byteArray));
    }
}
