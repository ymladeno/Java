import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Owner must be able to set its data, but not the rating
// None owner must be able to set rating, but not data
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    OwnerInvocationHandler(PersonBean person) { this.person = person; }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("setRating")) {
                throw new IllegalAccessException();
            } else {
                return method.invoke(person, args);
            }         
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
