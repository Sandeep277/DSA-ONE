package strings;
import java.util.Arrays;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        /*
        StringBuilder is a mutable sequence of characters. It is similar to String, but can be modified.
        StringBuilder is not synchronized, which means it is not thread-safe but is faster than StringBuffer.

        StringBuffer
        StringBuffer is similar to StringBuilder, but it is synchronized,
        which makes it thread-safe. It is slightly slower than StringBuilder due to the synchronization overhead.
         */

        // StringBuilder
        StringBuilder sb = new StringBuilder("Rahul");
        System.out.println(sb);

        // Reverse the string
        sb.reverse();
        System.out.println(sb);

        // insert at index
        sb.insert(1, 'a');
        System.out.println(sb);

        // convert to char array
        char[] ch = sb.toString().toCharArray();
        System.out.println(Arrays.toString(ch));

        // Converting String to StringBuffer
        String str = "Welcome to Java!";
        StringBuffer bufferFromString = new StringBuffer(str);
        System.out.println("StringBuffer from String: " + bufferFromString);

        // Converting StringBuffer to String
        StringBuffer sbf = new StringBuffer("Hello, World!");
        String strFromBuffer = sbf.toString();
        System.out.println("String from StringBuffer: " + strFromBuffer);

        // More StringBuilder methods
        sb.append(" Kumar");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.replace(1, 4, "abc");
        System.out.println(sb);

        sb.setCharAt(2, 'Z');
        System.out.println(sb);

        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        System.out.println(sb.length());
        sb.setLength(10);
        System.out.println(sb);

        sb.appendCodePoint(100);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Welcome");
        sb2.insert(3, " to Java");
        System.out.println(sb2);

        // StringBuffer
        StringBuffer sbf2 = new StringBuffer("Hello");
        System.out.println(sbf);

        sbf.reverse();
        System.out.println(sbf);

        sbf.insert(1, 'a');
        System.out.println(sbf);

        char[] ch2 = sbf.toString().toCharArray();
        System.out.println(Arrays.toString(ch2));

        // Converting StringBuffer to String
        StringBuffer sbf1 = new StringBuffer("Hello, World!");
        String strFromBuffer1 = sbf.toString();
        System.out.println("String from StringBuffer: " + strFromBuffer1);

        // More StringBuffer methods
        sbf.append(" World");
        System.out.println(sbf);

        sbf.delete(1, 3);
        System.out.println(sbf);

        sbf.deleteCharAt(2);
        System.out.println(sbf);

        sbf.replace(1, 4, "abc");
        System.out.println(sbf);

        sbf.setCharAt(2, 'Z');
        System.out.println(sbf);

        System.out.println(sbf.capacity());
        sbf.ensureCapacity(50);
        System.out.println(sbf.capacity());

        System.out.println(sbf.length());
        sbf.setLength(10);
        System.out.println(sbf);

        sbf.appendCodePoint(100);
        System.out.println(sbf);

        StringBuffer sbf3 = new StringBuffer("Java");
        sbf3.insert(2, " Programming");
        System.out.println(sbf3);
    }
}
