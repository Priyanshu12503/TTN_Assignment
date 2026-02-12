package Q5;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    Employee(){
    }

    public Employee(String firstName,  String lastName, int age, String designation) {
        this.designation = designation;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    Employee(Employee e){
        this.firstName=e.firstName;
        this.lastName=e.lastName;
        this.age=e.age;
        this.designation=e.designation;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString(){
        return "Employee details: The name is " + firstName + " last name is "+lastName+ " age is "+ age+ " and the designation is "+designation+".";
    }

    public static void main(String[] args) {

        Employee one = new Employee();
        one.setFirstName("Priyanshu");
        one.setLastName("Dutt");
        one.setAge(20);
        one.setDesignation("developer");
        System.out.println(one.toString());

        Employee two = new Employee("Krishna","Sharma",30,"Programmer");
        System.out.println(two.toString());

        Employee three = new Employee(two);
        three.setDesignation("copy");
        System.out.println(three.toString());

    }
}
