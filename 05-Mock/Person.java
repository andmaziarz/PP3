public class Person {
    private String name;
    private int age;

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

    //czy adult
    public boolean isAdult(){
        if (age>=18){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return name+","+Integer.toString(age);
    }

    //constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }   

}
