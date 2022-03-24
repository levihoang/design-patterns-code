package factorymethod.theory.present.dontuse;

class ButtonRectangle{
    void render(){

    }
    void onClick(){

    }
}
class ButtonCircle{
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

    // Muốn thêm một kiểu Button mới thì phải chỉnh sửa code đã có, phá vỡ tính Open/Closed Principle
    // 5 method và 100 type

//
    void load(String typeButton){
        if (typeButton == "ButtonRectangle") {
            ButtonRectangle buttonRectangle = new ButtonRectangle();
            buttonRectangle.onClick();
            buttonRectangle.render();
        }
        if (typeButton == "ButtonCircle") {
            ButtonCircle buttonCircle = new ButtonCircle();
            buttonCircle.onClick();
            buttonCircle.render();
        }
    }
    void mess(String typeMess){

    }
    void close(String typeClose){}
    void download(String typeDownload){

    }
}

public class Main {
    public static void main(String []args){


    }
}
