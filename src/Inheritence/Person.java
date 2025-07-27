
package Inheritence;

public class Person {

    public Person() {
        System.out.println("In Person Default Cons called");
    }
    // public Person(String name) {
    //     System.out.println("In Person Name Cons called with name "+name);
    // }


    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

}
