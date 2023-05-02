import java.util.ArrayList;
public class Developer{
    //------------------ attributes (private/protected) ----------------------
    private String name;
    private int exp;
    private double salary;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;
    private static int devCount;
    private static double totalSalary;
    private static int totalNumberOfProjects;

    //------------------ constructors ----------------------
    public Developer(){
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        Developer.devCount++;
    }

    public Developer(String name, int exp, double salary){
        this.name = name;
        this.exp = exp;
        this.salary = salary;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        Developer.devCount++;
        Developer.totalSalary += salary;
    }

//------------------ other class methods ----------------------
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

    //------------------ getters / setters  ----------------------
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getExp(){
        return this.exp;
    }

    public void setExp(int exp){
        this.exp = exp;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        Developer.totalSalary -= this.salary;
        Developer.totalSalary += salary;
        this.salary = salary;
    }

    public void setLanguages(String language){
        this.languages.add(language);
    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void setProjects(Project project){
        Developer.totalNumberOfProjects++;
        this.projects.add(project);
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }

    public static int getDevCount(){
        return Developer.devCount;
    }

    public static double getTotalSalary(){
        return Developer.totalSalary;
    }

    public static int getTotalNumberOfProjects(){
        return Developer.totalNumberOfProjects;
    }


}