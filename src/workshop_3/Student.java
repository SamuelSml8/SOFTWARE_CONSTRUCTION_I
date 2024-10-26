package workshop_3;

// STEP 1.1: Define a class named Student with the next properties
public class Student {
    // Property one (name)
    public String name;
    // Property two (age)
    public int age;
    // Property two (licensePlate) - imagine that licensePlate is a unique value
    public String licensePlate;

    public Student(String name, int age, String licensePlate) {
        this.name = name;
        this.age = age;
        this.licensePlate = licensePlate;
    }


    // Getters and Setters generated (This is not an official step)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Student {name: '" + name + "', age: " + age + ", license plate: '" + licensePlate + "'}";
    }
}
