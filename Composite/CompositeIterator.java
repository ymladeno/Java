import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> it = stack.peek();
            if (!it.hasNext()) {
                stack.pop();
                return hasNext();
            }
            return true;
        }
    }

    @Override
    public MenuComponent next() {
        Iterator<MenuComponent> it = stack.peek();
        MenuComponent cmp = it.next();

        if (cmp instanceof Menu) {
            stack.push(cmp.createIterator());
        }
        return cmp;
    }

    CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }
}
