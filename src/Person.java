public class Person {

    private String name;


//    Constructors ///
//    constructors don't need a data types, only in the parameters /
//    constructors should always be before the getters and setters //
    public Person(String name) {
//          ^_______________________ This must be the same as the Class name. In this case it is Person
        this.name = name;
    }

//   Getters //
    public String getName() {
        return this.name;
    }

//   Setters ////

    public void setName(String name) {
//TODO: change the name field to the passed value
    this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name + "!");
 }

}