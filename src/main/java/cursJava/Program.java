public class Program {
    public static void main(String[] args) {

        Person alex = new Person("Alecandru", 18, 175, 10);


        Person andrei = new Student("Andrei", 20, 180, 12, "A");
        ((Student) andrei).grow(10);
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());


        if (andrei instanceof Student) {
            System.out.println(andrei.getName() + " este student");
        }
        Student s = (Student)andrei;
        System.out.println(((Student) andrei).getClassGroup());

        System.out.println(alex.name + " are " + alex.age + " de ani");
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are energia " + alex.stamina);

        alex.sleep();
        System.out.println(alex.name + " are energia " + alex.stamina);

        if (alex.isMajor()){
            System.out.println(alex.name + " drinks beer");

            Dog rex = new Dog();
            rex.size = 20;

            rex.bark();



}}}
