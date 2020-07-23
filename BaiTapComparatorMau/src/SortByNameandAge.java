import java.util.Comparator;

class SortByNameAndAge implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.getName().compareTo(b.getName())!=0) {
            return a.getName().compareTo(b.getName());
        }
        else return a.getAge().compareTo(b.getAge());
    }

}
