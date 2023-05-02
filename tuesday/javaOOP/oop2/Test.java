public class Test{
    public static void main(String[] args){
        Developer dev1 = new Developer();
        System.out.println(dev1);
        dev1.setSalary(2000000000) ;
        // dev1.displayStatus();
        dev1.setName("Yang C");
        dev1.setExp(2);
        dev1.setSalary(90000);
        dev1.setLanguages("MERN");
        dev1.setLanguages("Java");
        // dev1.displayStatus();


        Project project1 = new Project();
        project1.title = "beautiful people";
        project1.language = "MERN";

        Project project2 = new Project();
        project2.title = "Google maps";
        project2.language = "Java";

        dev1.setProjects(project1);
        dev1.setProjects(project2);
        dev1.displayStatus();

        System.out.println("************************************* \n");
        Developer dev2 = new Developer("Tuan P", 2, 90000);
        dev2.displayStatus();
    }
}