/**
 * @description
 */
class AriExer {
    public static void main (String[] args) {
        int num = 60;
        int i2 = 60 & 15;
        String str = (i2 > 9) ? ((char)(i2 - 10 + 'A')) + "" : i2 + "";
        System.out.println(str);
        i2 >> 4;
        String str1 = (i2 > 9) ? ((char)(i2 - 10 + 'A')) + "" : i2 + "";

    }
}

class Weiyi {
    public static void main(String[] args) {
        int num1 = 10;
        num1 = (int)(num1 * 0.1);
        System.out.println(num1);
    }
}
