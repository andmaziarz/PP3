public class Family {
    private Person[] members;

    Family(Person[] members){
        this.members = members;        
    }

    public int adults(){
        int ad=0;
        for(int i=0; i<members.length; i++){
            if(members[i].getAge()>=18){
                ad++;
            }
        }
        return ad;
    }

    public static void main(String[] args) {
    
        Person p1 = new Person("Jaś", 14);
        Person p2 = new Person("Jaś", 18);
        Person p3 = new Person("Jaś", 21);
        Person p4 = new Person("Jan", 48);

        Family f1 = new Family(new Person[] {p1,p2,p3,p4});

        System.out.println(f1.adults());
    }
}
