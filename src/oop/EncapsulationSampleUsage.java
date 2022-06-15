package oop;

public class EncapsulationSampleUsage {

    public static void main(String args[]) {
        Person person = new Person();
        person.setName("James");
        person.setAge(20);
        // encap.setIdNum("12343ms");
        System.out.print(person);

        Person person2 = new Person();
        person2.setName("Helen");
        person2.setAge(25);

        System.out.print(person2);
        System.out.println(person);
    }

}


class Person {

    // instance variables/members
    private Integer idNum = personId++;
    private String name;
    private int age;
    public static String nationality = "Turkish";
    // class member
    private static Integer personId = 1;

//    public Person(){
//        this.idNum = personId;
//        ++personId;
//    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public Integer getIdNum() {
        return idNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idNum='" + idNum + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality: " + nationality +
                '}';
    }
}