import java.util.ArrayList;
public class Developer{
    // attrubutes
    public String name;
    public int exp;
    public double salary;
    public ArrayList<String> languages = new ArrayList<String>();
    public ArrayList<Project> projects = new ArrayList<Project>();


    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("exp: " + this.exp);
        System.out.println("salary: " + this.salary);
        System.out.println("languages: " + this.languages);
        System.out.println("projects: ");
        for(Project project : this.projects){
            project.displayInfo();
        }

    }
}