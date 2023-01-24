package creational.builder;

public class Client {
    public static void main(String[] args) {
        /*Student.Builder builder = Student.getBuilder();
        builder.setAge(12);
        builder.setName("Naman");
        builder.setGradYear(2023);


        Student st = new Student(builder);
        System.out.println("DEBUG");*/

        Student s = Student.getBuilder().setAge(23).setGradYear(2013).build();
        System.out.println(s.toString());


    }
}
