import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Student(){

    }
}

