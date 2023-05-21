package collections;

public class Student {
    private int id;
    private int marks;

    public Student( int id, int marks ) {
        this.id = id;
        this.marks = marks;
    }

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public int getMarks( ) {
        return marks;
    }

    public void setMarks( int marks ) {
        this.marks = marks;
    }

    @Override
    public String toString( ) {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                '}';
    }
}
