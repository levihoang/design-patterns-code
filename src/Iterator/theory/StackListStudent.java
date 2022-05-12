package Iterator.theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackListStudent {
    private Stack<Student> list = new Stack<>();

    public void addItem(Student item) {
        list.push(item);
    }

    public Iterator<Student> iterator() {
        return new MenuItemIterator(list);
    }

    class ListIterator implements Iterator<Student> {

        @Override
        public Boolean hasNext() {
            Student current = list.pop();
            if (list.isEmpty()){
                list.push(current);
                return false;
            } else {
                list.push(current);
                return true;
            }
        }

        @Override
        public Student next() {
            Student current = list.pop();
            list.push(current);
            return current;
        }
    }

    class MenuItemIterator implements Iterator<Student> {
        private int currentIndex = 0;
        private List<Student> menuItems = new ArrayList<Student>();

        public MenuItemIterator(List<Student> menuItems) {
            this.menuItems = menuItems;
        }

        public Boolean hasNext() {

            return currentIndex < menuItems.size();
        }

        public Student next() {
            return menuItems.get(currentIndex++);
        }
    }
}