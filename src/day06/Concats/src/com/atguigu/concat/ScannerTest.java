package com.atguigu.concat;

//import java.util.Scanner;
// class ScannerTest {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("请输入你的考试成绩：");
//         int grade = scan.nextInt();
//         if ( grade == 100) {
//             System.out.println("恭喜你，获得一辆BMW");
//         } else if (grade > 80) {
//             System.out.println("恭喜你，获得一个inpone 12");
//         } else if ( grade >= 60){
//             System.out.println("恭喜你，获得一个iPad");
//         } else {
//             System.out.println("一顿毒打！");
//         }
//     }
// }

// class Paixu {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("请输入第一个数");
//         int num1 = scan.nextInt();
//         System.out.println("请输入第二个数");
//         int num2 = scan.nextInt();
//         System.out.println("请输入第三个数");
//         int num3 = scan.nextInt();
//         if (num1 > num2) {
//             if (num1 > num3) {
//                 if(num2 >= num3) {
//                     System.out.println("从大到小依次为：" + num1 + num2 + num3);
//                 } else {
//                     System.out.println("从大到小依次为：" + num1 + num3 + num2);
//                 }
//             } else {
//                 System.out.println("从大到小依次为：" + num3 + num1 + num2);
//             }
//         } else {
//             // num2 大于 num1
//             if (num2 > num3 ) {
//                 // num2 最大
//                 if (num1 >= num3) {
//                     System.out.println("从大到小依次为：" + num2 + num1 + num3);
//                 } else {
//                     System.out.println("从大到小依次为：" + num2 + num3 + num1);
//                 }
//             } else {
//                 System.out.println("从大到小依次为：" + num3 + num2 + num1);
//             }
//         }
//     }
// }

// class DogAgeTool {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("请输入狗子的年龄：");
//         int dogAge = scan.nextInt();
//         double dogPersonAge =0;
//         if (dogAge < 0) {
//             System.out.println("你输入的年龄不合法。");
//         } else if (dogAge <= 2) {
//             dogPersonAge = dogAge * 10.5;
//         } else {
//             dogPersonAge = (dogAge - 2) * 4 + 10.5 * 2;
//         }
//         System.out.println("相当于人类年龄的" + dogPersonAge + "岁");
//     }
// }

// class Caipiao {
//     public static void main(String[] args) {
//         int A = 1000;
//         int B = 500;
//         int C = 300;
//         int D = 0;
//         int randomNum = (int)(Math.random()*90 + 10);
//         int geWei = randomNum % 10;
//         int shiWei = (int)(randomNum / 10);
//         System.out.println(randomNum);
//         System.out.println("当前彩票十位是"+ shiWei + "当前彩票个位是" + geWei);
//         System.out.println("请输入你的彩票号码（10 - 99 的整数）：");
//         Scanner scan = new Scanner(System.in);
//         int userNumber = scan.nextInt();
//         if (userNumber > 99) {
//             System.out.println("输入不合法；");
//         } else {
//             int geWei1 = userNumber % 10;
//             int shiWei1 = (int)(userNumber / 10);
//             if (geWei1 == geWei && shiWei1 == shiWei) {
//                 System.out.println("恭喜你，中大奖" + A);
//             } else if (geWei1 == shiWei && shiWei1 == geWei ) {
//                 System.out.println("很遗憾，猜反了，奖励" + B);
//             } else if(geWei == shiWei1 || geWei == geWei1 || shiWei == shiWei1 || shiWei == geWei1){
//                 System.out.println("恭喜你，获得三等奖" + C);
//             } else {
//                 System.out.println("谢谢惠顾");
//             }
//         }
//     }
// }

class SwitchCaseTest {
    public static void main(String[] args) {
         int num = (int)(Math.random() * 5);
         System.out.println(num);
         switch (num) {
             default:
                 System.out.println("牛逼");
             break;
             case 0:
                 System.out.println("0");
                 break;
             case 1:
                 System.out.println("1");
             break;
             case 2:
                 System.out.println("2");
             break;
             case 3:
                 System.out.println("3");
             break;
         }
    }
}