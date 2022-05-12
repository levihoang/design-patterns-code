package command.theory;

public class Client {
    public static void main(String []args){
        BankApp bankApp = new BankApp();
        bankApp.open();
        bankApp.close();
        bankApp.update();

    }
}

interface Command{
    void execute();
}

class BankApp{
    private OpenAccount openAccount;
    private CloseAccount closeAccount;
    private UpdateAccount updateAccount;

    public BankApp() {
        openAccount = new OpenAccount();
        closeAccount = new CloseAccount();
        updateAccount = new UpdateAccount();
    }

    void open(){
        openAccount.execute();
    }

    void close(){
        closeAccount.execute();
    }

    void update(){
        updateAccount.execute();
    }
}

class Account{
    void open(){
        System.out.println("Mở tài khoản");
    }

    void close(){
        System.out.println("Đóng tài khoản");
    }

    void update(){
        System.out.println("Cập nhật tài khoản");
    }
}

class OpenAccount implements Command {
    Account acc;

    public OpenAccount() {
        acc = new Account();
    }

    @Override
    public void execute() {
        acc.open();
    }
}

class UpdateAccount implements Command{
    Account acc;

    public UpdateAccount() {
        acc = new Account();
    }


    @Override
    public void execute() {
        acc.update();
    }
}

class CloseAccount implements Command{
    Account acc;

    public CloseAccount() {
        acc = new Account();
    }

    @Override
    public void execute() {
        acc.close();
    }
}
