import java.util.ArrayList;
public class Developer{
    // attrubutes
    private String name;
    private int exp;
    private double salary;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;

    // Constructors
    public Developer(){
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }

    public Developer(String name, int exp, double salary){
        this.name = name;
        this.exp = exp;
        this.salary = salary;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }


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
        this.salary = salary;
    }

    public void setLanguages(String language){
        this.languages.add(language);
    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void setProjects(Project project){
        this.projects.add(project);
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }


}