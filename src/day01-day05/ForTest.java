import java.util.Scanner;
class ForTest {
    public static void main(String[] args) {
        String str = "Hello world";
        for (int i = 0, len = 1000; i < len; i++) {
            System.out.println(str);
        }
    }
}

class Sum {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1, len = 150; i <= len; i++) {
            System.out.print(i + "   ");
            if (i % 3 == 0 ) {
                System.out.print("3333   ");
            }
            if (i % 5 == 0 ) {
                System.out.print("5555   ");
            }
            if (i % 7 == 0 ) {
                System.out.print("7777   ");
            }
            System.out.println();
        }
    }
}

class MaxYue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你要求公约数的第一个数（int）");
        int num1 = scan.nextInt();
        System.out.println("请输入你要求公约数的第二个数（int）");
        int num2 = scan.nextInt();
        int minNum = num1 > num2 ? num2 : num1; // 获取较小的一个数，作为求公约数的初始值
        int maxYue = 0;
        for (int i = minNum; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0 ) {
                maxYue = i;
                System.out.println("最大公约数为：" + maxYue);
                break;
            }
        }
        if (maxYue == 0) {
            System.out.println("两个数字不存在公约数！");
        }
    }
}

class ShuiXianHua {
    public static void main(String[] args) {
        for(int i = 100, len = 1000; i < len; i++) {
            int ge = i % 10;
            int shi = i % 100 / 10;
            int bai = i / 100;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai  * bai ) {
                System.out.println(i);
            }
        }
    }
}

class SanJiao {
    public static void main( String[] args) {
        for(int i = 1; i < 5; i++) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 5; i > 0; i--) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

class NineNineTable {
    public static void main(String[] args) {
        for (int i = 0, len = 10; i < len; i++) {
            for(int j = 1, length = i + 1; j < length; j++) {
                int sum = i * j;
                System.out.print(i + " X " + j + " = " + sum + "   ");
            }
            System.out.println();
        }
    }
}

class ZhiShu {
    public static void main(String[] args) {
        int count = 0;
        Boolean flag = true;
        long start = System.currentTimeMillis();
        lable: for(int i = 2, len = 100000; i < len; i++) {
            double temp = Math.sqrt(i);
            for(int j = 2; j <= temp; j++) {
                if (i % j == 0) {
                    continue lable;
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为" + (end - start));
        System.out.println(count);
    }
}