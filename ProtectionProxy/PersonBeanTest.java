import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class PersonBeanTest {
    Hashtable<String, PersonBean> personBeanDB;
    public static void main(String[] args) {
        PersonBeanTest test = new PersonBeanTest();
    }

    PersonBeanTest() {
        try {
            initializeDB();
            PersonBean ownerPerson = getPersonFromDB("Ali Mali");
            InvocationHandler ownerHandler = new OwnerInvocationHandler(ownerPerson);
            PersonBean ownerProxy = getProxy(ownerPerson, ownerHandler);

            System.out.println("Name: " + ownerProxy.getName());
            ownerProxy.setInterest("hiking, gambling");
            System.out.println("Interests: " + ownerProxy.getInterest());

            try {
                ownerProxy.setRating(10);   
            } catch (Exception e) {
                System.out.println("Owner can't set its own rating");
            }

            PersonBean noneOwnerPerson = getPersonFromDB("Jane Bean");
            InvocationHandler noneOwnerHandler = new NoneOwnerInvocationHandler(noneOwnerPerson);
            PersonBean noneOwnerProxy = getProxy(noneOwnerPerson, noneOwnerHandler);

            System.out.println("Name is " + noneOwnerProxy.getName());
            try {
                noneOwnerProxy.setInterest("boiling");
            } catch (Exception e) {
                System.out.println("None owner can't set interest");
            }

            noneOwnerProxy.setRating(3);
            System.out.println("Rating set from none owner");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private PersonBean getProxy(PersonBean person, InvocationHandler handler) {
        return (PersonBean)Proxy.newProxyInstance(
            person.getClass().getClassLoader(), person.getClass().getInterfaces(), handler);
    }

    private PersonBean getPersonFromDB(String name) {
        return personBeanDB.get(name);
    }

    private void initializeDB() {
        personBeanDB = new Hashtable<String, PersonBean>();
        PersonBean ali = new PersonBeanImpl();
        ali.setName("Ali Mali");
        ali.setGender("male");
        ali.setInterest("tennis, fotball");
        personBeanDB.put(ali.getName(), ali);


        PersonBean jane = new PersonBeanImpl();
        jane.setName("Jane Bean");
        jane.setGender("female");
        jane.setInterest("swimming, dancing");
        personBeanDB.put(jane.getName(), jane);
    }
}
