class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id.equals(student.id);
    }
}

public class HashCodeEqualsExample {
    public static void main(String[] args) {
        Student student1 = new Student("1001", "Alice");
        Student student2 = new Student("1001", "Bob");

        System.out.println("Equality Check: " + student1.equals(student2));
    }
}
