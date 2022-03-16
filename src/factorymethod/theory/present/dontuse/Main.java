package factorymethod.theory.present.dontuse;

class ButtonCircle{
    void render(){

    }
    void onClick(){

    }
}
class ButtonRectangle{
    void render(){

    }
    void onClick(){

    }
}
class ClientCode{
    // Lợi dụng Dependency Inversion Principle
    // Chỉ mới có 2 loại button. Chưa tính là còn các obj khác như windows, notifications
    // => method phải sửa = method * số obj

    // Nếu dùng factory thì ta chỉ cần
    // => method phải sửa = method * 1

    // Che dấu code, người dùng client không biết được thực chất của nó là gì, chỉ biết abstract class
    // hay interface
    void load(ButtonRectangle buttonRectangle){
        buttonRectangle.onClick();
        buttonRectangle.render();
    }
    void load(ButtonCircle buttonCircle){
        buttonCircle.onClick();
        buttonCircle.render();
    }

    void mess(ButtonRectangle buttonRectangle){

    }
    void mess(ButtonCircle buttonCircle){

    }

    void close(ButtonRectangle buttonRectangle){}
    void close(ButtonCircle buttonCircle){}

    void download(ButtonRectangle buttonRectangle){}
    void download(ButtonCircle buttonCircle){}
}

public class Main {
    public static void main(String []args){


    }
}
