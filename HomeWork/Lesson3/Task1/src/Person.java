import java.time.Year;

/**
 * Created by Bogdan on 15.08.2017.
 */
public class Person {
    private String name;
    private  int birthYear;
    public Person(){
    }
    public Person(String name,int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getAge(){
        int age= Year.now().getValue()-birthYear;
        return age;
    }
    public void inputPerson(String name,int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public void changeName(String name){
        this.name=name;
    }
    public String getPerson(){
        String s=String.format("Name - %s;%nYear of birth - %d%n",name,birthYear);
        return s;
    }
}
