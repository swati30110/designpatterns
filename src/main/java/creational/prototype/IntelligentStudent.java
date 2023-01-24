package creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntelligentStudent extends Student{
    int iq;
    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }
}
