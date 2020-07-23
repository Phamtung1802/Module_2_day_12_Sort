import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student hung=new Student("hung",18);
        Student hoa=new Student("Hoa",21);
        Student hung2=new Student("hung",17);
        Student Phan=new Student("Phan",18);
        StudentList stdlist=new StudentList();
        stdlist.add(hung);
        stdlist.add(hoa);
        stdlist.add(hung2);
        stdlist.add(Phan);
        System.out.println(stdlist);

        SortByNameAndAge playerComparator = new SortByNameAndAge();

        Collections.sort(stdlist.list,playerComparator);
        System.out.println(stdlist);
    }
}
