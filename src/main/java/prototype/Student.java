package prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public Student(){}
    public Student(Student s ){
        this.age = s.age;
        this.name = s.name;
        this.batch = s.batch;
        this.averageBatchPsp = s.averageBatchPsp;
        this.studentPsp = s.studentPsp;
    }


    @Override
    public Student  clone() {
        return new Student(this);
    }
}
