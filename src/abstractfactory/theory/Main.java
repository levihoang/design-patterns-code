package abstractfactory.theory;

interface Button{
    void render();
}

interface CheckBox{
    void render();
}

class WinButton implements Button{

    @Override
    public void render() {
        System.out.println("WinButton render");
    }
}

class WinCheckBox implements CheckBox{

    @Override
    public void render() {
        System.out.println("WinCheckBox render");
    }
}

class MacButton implements Button{

    @Override
    public void render() {
        System.out.println("MacButton render");
    }
}

class MacCheckBox implements CheckBox{

    @Override
    public void render() {
        System.out.println("MacCheckBox render");
    }
}


interface GUIFactory{
    Button createButton();
    CheckBox createCheckBox();
}

class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}

class MacFactory implements GUIFactory{


    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

public class Main {
    public static void main(String []args){
        GUIFactory factory = new MacFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.render();
        checkBox.render();
    }
}
