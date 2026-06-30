public class BankAccount {
    private double moneyLeft;
    private String accountNum;

    public BankAccount(String an){
        this.moneyLeft=0;
        this.accountNum=an;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getMoneyLeft() {
        return moneyLeft;
    }

    public double deposit(double money){
        if (money>0){
            this.moneyLeft+=money;
        }
        return this.moneyLeft;
    }
    public double withdraw(double takingMoney){
        if (this.moneyLeft-takingMoney>=0){
            this.moneyLeft-=takingMoney;
        }
        return this.moneyLeft;
    }
}
