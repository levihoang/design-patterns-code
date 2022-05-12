package singleton.theory;


class Hotel{
    static Hotel hotel;
    public static Hotel getInstance(){
        if (hotel == null){
            hotel = new Hotel();
            System.out.println("new Hotel()");
        } else {
            System.out.println("return hotel");
        }
        return hotel;
    }

    public Hotel() {
    }
    public static String name;
}
public class Client {
    public static void main(String []args){
        Hotel hotel = Hotel.getInstance();
        Hotel hotel1 = Hotel.getInstance();
    }
}
