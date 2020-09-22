class FamilyAcount {
    public static void main(String[] args) {
        Boolean isFlag = true;
        String details = "收支\t账户金额\t收支金额\t说明\n";
        int balance = 10000; // 余额
        while (isFlag) {
            System.out.println("--------------------家庭收支记账软件--------------------\n");
            System.out.println("                 1. 收支明细");
            System.out.println("                 2. 登记收入");
            System.out.println("                 3. 登记支出");
            System.out.println("                 4. 退出\n");
            System.out.print("                   请选择（1 - 4）：");
            // 获取用户的选择1--4之间
            char selection = Utility.readMenuSelection();
            switch(selection) {
                case '1':
                    System.out.println("--------------------收支明细表--------------------");
                    System.out.println(details);
                    System.out.println("-------------------------------------------------");
                break;
                case '2':
                    System.out.println("--------------------登记收入--------------------");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();
                    balance += money;
                    details += "收入\t"+ balance + "\t\t" + money + "\t\t" + info + "\n";
                    System.out.println("登记完成。");
                    break;
                case '3':
                    System.out.println("--------------------登记支出--------------------");
                    System.out.print("本次支出金额：");
                    int money1 = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String info1 = Utility.readString();
                    if (balance >= money1) {
                        balance -= money1;
                        details += "支出\t"+ balance + "\t\t" + money1 + "\t\t" + info1 + "\n";
                        System.out.println("登记完成。");
                    } else {
                        System.out.println("登记失败，超过余额。");
                    }
                    break;
                case '4':
                    System.out.println("请确认是否退出(Y/N)？");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        System.out.println("程序退出");
                        isFlag = false;
                    }
            }
        }
    }
}