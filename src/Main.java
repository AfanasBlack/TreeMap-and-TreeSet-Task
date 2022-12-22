import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Алексей", "Иванов", 13));
        people.add(new Person("Игорь", "Сафронов", 10));
        people.add(new Person("Юра", "Сафронов", 35));
        people.add(new Person("Александр", "Сухов", 25));
        people.add(new Person("Александр", "Сухов", 65));
        people.add(new Person("Гриша", "Аббакумовский68", 42));
        people.add(new Person("Гриша", "Аббакумовский", 43));

        Predicate<Person> min18 = person -> person.getAge() < 18;

        people.removeIf(min18);

        Collections.sort(people, new PersonsNobilityComparator(12));

        System.out.println(people);
    }
}
