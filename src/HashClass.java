import java.util.HashSet;
import java.util.Hashtable;

public class HashClass
{
    public static void main(String[] args) {
        HashSet<String> states=new HashSet<String>();
        //add-добавление в список
        states.add("Russia");
        states.add("USA");
        states.add("Germany");
        System.out.println(states);
        boolean st=states.add("Germany");
        System.out.println(st);
        System.out.println(states);
        //size()- размер
        System.out.println(states.size());
        for (String s:states) {
            System.out.println(s+" "+s.hashCode());
        }
        states.remove("Germany");
        System.out.println(states);
        HashSet<Person> people=new HashSet<>();
        people.add(new Person("Vasia"));
        people.add(new Person("Ivan"));
        people.add(new Person("Fedor"));
        for (Person s:people) {
            System.out.println(s.getName()+" "+s.hashCode());
        }
    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
