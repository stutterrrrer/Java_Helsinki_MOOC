
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthew = new Account("Matthews account", 1000);
        Account mine = new Account("My account", 0);
        matthew.withdrawal(100);
        mine.deposit(100);
        System.out.println(matthew + "\n" + mine);
    }
}