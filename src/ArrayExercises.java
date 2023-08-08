import java.util.Arrays;
public class ArrayExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers array: " + Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jake");
        people[2] = new Person("James");

        Person newPerson = new Person("David");
        people = addPerson(people, newPerson);

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] peopleArray, Person newPerson) {
        Person[] newArray = new Person[peopleArray.length + 1];

        for (int i = 0; i < peopleArray.length; i++) {
            newArray[i] = peopleArray[i];
        }

        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
}
