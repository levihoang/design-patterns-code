package state.theory;

interface State{
    void HandleRequest();
}

class LockedState implements State{
    @Override
    public void HandleRequest() {
        System.out.println("LockedState");
    }
}

class ActiveState implements State{

    @Override
    public void HandleRequest() {
        System.out.println("ActiveState");
    }
}

class FreezeState implements State{
    @Override
    public void HandleRequest() {
        System.out.println("FreezeState");
    }
}

class BlackState implements  State{

    @Override
    public void HandleRequest() {
        System.out.println("BlackState");
    }
}

class AccountContext{
    State state;
    void setState(State state){
        this.state = state;
    }
}
public class Client {
    public static void main(String []args){
        AccountContext accountContext = new AccountContext();
        accountContext.setState(new FreezeState());
        accountContext.state.HandleRequest();
    }
}
