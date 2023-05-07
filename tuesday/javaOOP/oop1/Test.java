public class Test{
    public static void main(String[] args){
        Developer dev1 = new Developer();
        System.out.println(dev1);
        // dev1.displayStatus();
        dev1.name = "Yang C";
        dev1.exp = 2;
        dev1.salary = 90000;
        dev1.languages.add("MERN");
        dev1.languages.add("Java");
        // dev1.displayStatus();


        Project project1 = new Project();
        project1.title = "beautiful people";
        project1.language = "MERN";

        Project project2 = new Project();
        project2.title = "Google maps";
        project2.language = "Java";

        dev1.projects.add(project1);
        dev1.projects.add(project2);
        dev1.displayStatus();
    }
}