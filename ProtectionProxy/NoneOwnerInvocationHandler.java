import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NoneOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    NoneOwnerInvocationHandler(PersonBean person) { this.person = person; }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().equals("setRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
