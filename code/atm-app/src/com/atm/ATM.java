package com.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accList = new ArrayList<>();
    private Account currentAccount;
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();

    /* 启动程序 */
    public void start() {
        while (true) {
            System.out.println("==欢迎进入ATM操作系统==");
            System.out.println("按1登录账户");
            System.out.println("按2开通账户");
            String command = sc.next();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":
                    openAccount();
                    break;
                default:
                    System.out.println("输入的指令有误,请重新输入");
            }
        }
    }

    /**
     * 登录账户
     */
    private void login() {
        System.out.println("==登录账户==");

        // 如果系统中没有直接抛出
        if (accList.size() == 0) {
            System.out.println("查无此号");
            return;
        }

        while (true) {
            System.out.println("请输入卡号:");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("查无此号");
            } else {
                while (true) {
                    System.out.println("请输入密码:");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)) {
                        currentAccount = acc;
                        System.out.println("恭喜" + acc.getUserName() + "成功登录了系统，您的卡号是：" + acc.getCardId());
                        showUserCommand();
                        return;
                    } else {
                        System.out.println("密码错误,请重新输入");
                    }
                }
            }
        }
    }

    /**
     * 展示当前用户登录后的操作界面
     */
    private void showUserCommand() {
        while (true) {
            System.out.println(currentAccount.getUserName() + "你可以选择一下功能对账户的处理:");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            String command = sc.next();
            switch (command) {
                case "1":
                    showLoginAccount();
                    break;
                case "2":
                    saveAccount();
                    break;
                case "3":
                    WithDrawMoney();
                    break;
                case "4":
                    transferMoney();
                    break;
                case "5":
                    editPassWord();
                    return;
                case "6":
                    System.out.println(currentAccount.getUserName() + "，您退出了");
                    return;
                case "7":
                    if(signOut())return;
                    break;
                default:
                    System.out.println("输入的指令有误，请重新输入");
            }
        }
    }

    /**
     * 销户
     */
    private boolean signOut(){
        System.out.println("==进入销户系统==");
        while (true) {
            System.out.println("是否注销y/n");
            String command = sc.next();
            switch (command){
                case "y":
                    if(currentAccount.getMoney() == 0){
                        accList.remove(currentAccount);
                        System.out.println("注销成功");
                        return true;
                    }else{
                        System.out.println("当前账户下面还存在余额，不可注销");
                        return false;
                    }
                case "n":
                    return false;
                default:
                    System.out.println("是否注销y/n");
            }
        }
    }

    /**
     * 修改密码
     */
    private void editPassWord(){
        while (true) {
            System.out.println("请输入当前密码：");
            String oldPassWord = sc.next();
            if(currentAccount.getPassWord().equals(oldPassWord)){
                System.out.println("请输入修改后的密码：");
                String newPassWord = sc.next();
                currentAccount.setPassWord(newPassWord);
                System.out.println("修改成功");
                System.out.println("请重新登录");
                return;
            }else{
                System.out.println("你输入的密码不正确，请重新输入");
            }
        }
    }

    /**
     * 存款
     */
    private void saveAccount() {
        System.out.println("请输入要存储的金额：");
        double money = sc.nextDouble();
        double newMoney = money + currentAccount.getMoney();
        currentAccount.setMoney(newMoney);
        System.out.println("存款成功，您当前的余额为：" + newMoney);
    }

    /**
     * 取款
     */
    private void WithDrawMoney() {
        double currMoney = currentAccount.getMoney();

        if (currentAccount.getMoney() < 100) {
            System.out.println("当前账户下余额小于100不足以提现，剩余余额为：" + currMoney);
            return;
        }
        while (true) {
            System.out.println("请输入要取的金额(不低于100)");
            double money = sc.nextDouble();
            if (money < 100) {
                System.out.println("取款金额需要大于100,请重新输入");
            } else if (money > currMoney) {
                System.out.println("当前余额不足,您的剩余余额是：" + currMoney);
            } else if (money > currMoney) {
                System.out.println("你输入的金额超出了提现额度，请重新输入");
            } else {
                currentAccount.setMoney(currMoney - money);
                System.out.println("取出成功");
                break;
            }
        }
    }

    /**
     * 转账
     */
    private void transferMoney() {

        if (accList.size() > 2) {
            System.out.println("有第二个人吗，你给鬼转账吗哥");
            return;
        }

        if (currentAccount.getMoney() == 0) {
            System.out.println("自己都没钱了，还想着转给别人，你真是个好人");
            return;
        }
        while (true) {
            System.out.println("请输入对方卡号：");
            String cardId = sc.next();
            // 需要查找该卡号是否存在
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("该卡号不存在");
            } else {
                String currName = "*" + acc.getUserName().substring(1);
                // 如果存在该卡号，需要去验证该卡号的姓名是否属实
                System.out.println("您当前要为" + currName + "转账,请输入姓氏确认：");
                String userName = sc.next();
                if (currentAccount.getUserName().startsWith(userName)) {
                    // 成功后开始转账
                    double currMoney = currentAccount.getMoney();
                    while (true) {
                        System.out.println("当前余额为：" + currMoney);
                        System.out.println("请输入要转账的余额：");
                        double newMoney = sc.nextDouble();
                        if(newMoney > currMoney){
                            System.out.println("你没有那么多钱哦，转少一些");
                        }else{
                            // 自己账户和地方账户都需要变更
                            currentAccount.setMoney(currMoney - newMoney);
                            acc.setMoney(acc.getMoney() + newMoney);
                            System.out.println("转账成功,当前余额为：" + currentAccount.getMoney());
                            return;
                        }
                    }
                } else {
                    System.out.println("名称错误，请重新输入");
                }
            }
        }
    }

    /**
     * 当前用户账户信息
     */
    private void showLoginAccount() {
        System.out.println(currentAccount.getUserName() + "您的账户信息如下：");
        System.out.println("卡号：" + currentAccount.getCardId());
        System.out.println("密码：" + currentAccount.getPassWord());
        System.out.println("姓名：" + currentAccount.getUserName());
        System.out.println("性别：" + currentAccount.getSex());
        System.out.println("余额：" + currentAccount.getMoney());
        System.out.println("提现额度：" + currentAccount.getLimit());
    }

    /**
     * 开通账户
     */
    private void openAccount() {
        Account account = new Account();
        System.out.println("==开通账户==");

        System.out.println("请输入姓名:");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入性别:");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                account.setSex(sex);
                break;
            } else {
                System.out.println("输入的性别有误,请重新输入");
            }
        }

        System.out.println("请输入密码:");
        String passWord = sc.next();
        account.setPassWord(passWord);

        System.out.println("请输入提现额度:");
        int limit = sc.nextInt();
        account.setLimit(limit);

        String cardId = createCardId();
        account.setCardId(cardId);

        accList.add(account);

        System.out.println("恭喜" + account.getUserName() + "开户成功,您的卡号是：" + account.getCardId());
    }

    /* 生成卡号 */
    private String createCardId() {
        while (true) {
            String cardIds = "";
            for (int i = 0; i < 8; i++) {
                cardIds += r.nextInt(10);
            }

            if (getAccountByCardId(cardIds) == null) {
                return cardIds;
            }
        }
    }

    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null; // 查不到
    }

}
