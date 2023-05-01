public class JavaBasic {
    //entry point method
    // The JRE needs to call on the programs main method for the program to run.
    // public because this method needs to be callable outside the class.
    // static methods can be called without having to create an instance of the class to call it.
    // JRE by default will call on your class.main(args) 
    public static void main(String[] args){
        System.out.println("Hello world");

        // Variables for student
        String firstName = "Tracey";
        String lastName = "Duga";
        Integer age = 25;
        boolean isPassing = true;
        double weight = 175.65;
        char grade = 'A';
        System.out.println(firstName + " " + lastName + "\n" +
        "age: " + age + "\n" + "is Passing?: " + isPassing + "\n" + "weight: " + weight + "\n" + "grade: " + grade);
        System.out.println(Integer.MAX_VALUE);

        // Conditionals

        // if(weight < 100){
        //     System.out.println("you need to gain weight");
        // } else {
        //     System.out.println("you are fine");
        // }

        System.out.println(weight < 100 ? "you need to gain weight" : "you are fine");


        String name = "Gray B";
        System.out.println(name.length());

        String name1 = firstName.concat(lastName);
        System.out.println(name1);

        String greeting = String.format("Hi %s, you are %d years old", firstName, age);
        System.out.println(greeting);
        System.out.printf("Hi %s, you are %d years old \n", firstName, age);

        // creating Strings
        String firstName1 = "Tina";
        String firstName2 = new String("Tina");
        String firstName3 = "Tina";

        System.out.println(firstName1 == firstName3); // true
        System.out.println(firstName1 == firstName2); //false
        System.out.println(firstName1.equals(firstName2)); // true

    }
}


