import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    ArrayList<Student> list;

    public StudentList() {
        this.list = new ArrayList<Student>();
    }



    public void add(Student hung) {
        this.list.add(hung);
    }
    @Override
    public String toString(){
        StringBuffer a=new StringBuffer();
        for(Student b:list){
            a.append("name= "+b.getName()+" Age= "+b.getAge()+"\n");
        }
        return a.toString();
    }

}

