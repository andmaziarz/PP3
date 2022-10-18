public class Student {
    
    // wykaz atrybutów 
    String name;
    int age;
    String idCard;
    boolean validCard;
    int semester;
    double averageGrade;
    
    // wykaz metod
    public void sayHello(){
        System.out.println("Hello");   
    }
    
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Semester number: " + semester);
        System.out.println("Average grade: " + averageGrade);
        
    }
    
    public void isCardValid(){
        System.out.println("Name: " + name);
        System.out.println("ID Card: " + idCard);
        if (validCard){
           System.out.println("Card valid"); 
        }else{
            System.out.println("Card invalid");
        }
    }
    
    public void changeValid(){
        validCard =! validCard;
    }
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Jacek";
        s1.age = 21;
        s1.idCard = "233567";
        s1.validCard = true;
        s1.semester = 4;
        s1.averageGrade = 4.43;
        
        s1.displayInfo();
        s1.isCardValid();
        s1.changeValid();
        s1.isCardValid();
    }
}