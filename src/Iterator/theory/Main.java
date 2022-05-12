package Iterator.theory;

import java.util.Stack;

class Test {
    public Stack<Integer> list = new Stack<>();

    void preAdd() {
        list.push(1);
        list.push(2);
        list.push(3);
    }

    void print() {
        int item;
        while (!list.isEmpty()) {
            item = list.pop();
            System.out.println(item);
        }
    }
}

public class Main {


    public static void main(String[] args) {
        Test test = new Test();
        test.preAdd();
        test.print();
    }

}
