package questions;

public class BasicQuestions {
    public static void main(String[] args) {
        numToBinary(13, "");
        numToBinaryLoop(9);
        binaryToNum("1001");
    }

    // number to binary
    public static void numToBinary(int num, String str) {
        if (num == 0) {
            System.out.println(new StringBuilder(str).reverse().toString());
            return;
        }
        int curr = num % 2;
        numToBinary(num/2, str+curr);
    }
    public static void numToBinaryLoop(int num) {
        String str = "";
        while (num != 0) {
            int rem = num % 2;
            str += rem;
            num = num / 2;
        }

        StringBuilder str2 = new StringBuilder(str);
        str2.reverse().toString();
        System.out.println(str2);
    }

    // binary to number
    public static void binaryToNum(String bi) {
        int num = 0;
        int len = bi.length();
        for (int i = 0; i < bi.length(); i++) {
            char ch = bi.charAt(len - i - 1);
            num += (ch - '0') * Math.pow(2, i);
        }
        System.out.println(num);
    }
}
