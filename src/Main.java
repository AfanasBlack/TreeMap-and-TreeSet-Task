import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Игорь", "Сафронов", 10));
        people.add(new Person("Юра", "Сафронов", 35));
        people.add(new Person("Александр", "Сухов", 25));
        people.add(new Person("Александр", "Сухов", 65));
        people.add(new Person("Гриша", "Аббакумовский68", 42));
        people.add(new Person("Гриша", "Аббакумовский", 43));

        //Collections.sort(people, new PersonsNobilityComparator(12)); "Прошлая сортировка компаратора"

        people.sort(((o1, o2) -> {
            if (o1.getSurname().length() > 12 & o2.getSurname().length() > 12) return Integer.compare(o2.getAge(), o1.getAge());
            else
                if (o1.getSurname().length() < o2.getSurname().length()) return 1;
                else if (o1.getSurname().length() > o2.getSurname().length()) return -1;
                else if (o1.getAge() < o2.getAge()) return 1;
                else return -1;
        }));


        System.out.println(people);
    }
}
