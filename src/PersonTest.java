public class PersonTest {
    public static void main(String[] args) {
//  This is creating a new Person object with a name. This is using the Person method
//        Person person = new Person("James");
//        // This is getting and printing the person's name
//        System.out.println(person.getName());
//        person.setName("Steve");
//        System.out.println(person.getName());
////                        ^__ this line is not necessary it is just to test it
//        person.sayHello();

////////////// Understanding references ///////
//  Example 1.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
////                                     ^__ This line is saying that if the values ("john") are equal to each other it will show true
//        System.out.println(person1 == person2);

//  Example 2.
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
