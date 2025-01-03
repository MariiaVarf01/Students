class Student {
    private String name;
    private int id;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int id, int age, String grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    // Display details
    public void displayDetails() {
        System.out.printf("ID: %d, Name: %s, Age: %d, Grade: %s%n", id, name, age, grade);
    }
}
