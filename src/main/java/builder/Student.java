package builder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

//    Student(String name, int age, String universityName, ...) {
//
//    }

    Student(Builder builder) {
        // validation starts
        if (builder.getGradYear() > 2022) {
            throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        }
        // validation completed

        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        String name;
        int age;
        double psp;
        String universityName;
        String batch;
        long id;
        int gradYear;
        String phoneNumber;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getPsp() {
            return psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public String getBatch() {
            return batch;
        }

        public long getId() {
            return id;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public Student build(){
            return new Student(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getBatch() {
        return batch;
    }

    public long getId() {
        return id;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
