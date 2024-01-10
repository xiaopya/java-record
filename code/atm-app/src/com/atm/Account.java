package com.atm;

/**
 * 用户：账户信息
 */
public class Account {
    /**
     * 姓名
     */
    private String userName;
    /**
     * 性别
     */
    private char sex;
    /**
     * 卡号
     */
    private String cardId;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 余额
     */
    private double money;
    /**
     * 提现额度
     */
    private double limit;

    public String getUserName() {
        return userName + (sex == '男' ? "先生" : "女士");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
