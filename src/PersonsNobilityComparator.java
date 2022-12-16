import java.util.Comparator;

public class PersonsNobilityComparator implements Comparator<Person> {

    private int maxSurname;

    public PersonsNobilityComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {

        if (o1.getSurname().length() > maxSurname & o2.getSurname().length() > maxSurname) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            if (o1.getSurname().length() < o2.getSurname().length()) {
                return 1;
            } else if (o1.getSurname().length() > o2.getSurname().length()) {
                return -1;
            } else if (o1.getAge() < o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
