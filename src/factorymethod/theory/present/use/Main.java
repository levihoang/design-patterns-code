package factorymethod.theory.present.use;

interface Button{
    void render();
    void onClick();
}
class CircleButton implements Button{

    @Override
    public void render() {
        System.out.println("CircleButton render");

    }

    @Override
    public void onClick() {
        System.out.println("CircleButton onClick");
    }
}
class RectangleButton implements Button{

    @Override
    public void render() {
        System.out.println("RectangleButton render");
    }
    @Override
    public void onClick() {
        System.out.println("RectangleButton onClick");
    }
}
class ABCButton implements Button{

    @Override
    public void render() {

    }

    @Override
    public void onClick() {

    }
}

interface ShareFile{
    void share();
}
class AirDrop implements ShareFile{

    @Override
    public void share() {
        System.out.println("AirDrop succeeded");
    }
}
class NearByShare implements ShareFile{

    @Override
    public void share() {
        System.out.println("NearByShare succeeded");
    }
}

interface FaceID{
    void Face();
}
class FaceID2D implements FaceID{

    @Override
    public void Face() {
        System.out.println("Face ID 2D");
    }
}
class FaceID3D implements FaceID{

    @Override
    public void Face() {
        System.out.println("Face ID 3D");
    }
}

abstract class FactoryMethod{
    abstract Button createButton();
    abstract ShareFile createShareFile();
    abstract FaceID createFaceID();
}

class AndroidFactory extends FactoryMethod{

    @Override
    Button createButton() {

        return new ABCButton();
    }

    @Override
    ShareFile createShareFile() {
        return new NearByShare();
    }

    @Override
    FaceID createFaceID() {
        return new FaceID2D();
    }
}

class IOSFactory extends FactoryMethod{

    @Override
    Button createButton() {
        return new CircleButton();
    }

    @Override
    ShareFile createShareFile() {
        return new AirDrop();
    }

    @Override
    FaceID createFaceID() {
        return new FaceID3D();
    }
}


class ClientCode{
    FactoryMethod factoryMethod;

    public ClientCode(FactoryMethod factoryMethod){
        this.factoryMethod = factoryMethod;
    }

    public ClientCode(){
        this.factoryMethod = new IOSFactory();
    }

    void load(){
        Button button = factoryMethod.createButton();
        ShareFile shareFile = factoryMethod.createShareFile();
        FaceID faceID = factoryMethod.createFaceID();
        button.onClick();
        button.render();
    }
}
public class Main {
    public static void main(String []args){
        ClientCode clientCode = new ClientCode(new IOSFactory());
        ClientCode client_Code = new ClientCode();
        clientCode.load();
    }
}
