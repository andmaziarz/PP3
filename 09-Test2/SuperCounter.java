public class SuperCounter extends Counter {
    SuperCounter(int c){
        super(c);
    }

    public void addN(int n){
        for(int i=0;i<n;i++){
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter c1 = new SuperCounter(1);
        c1.add1();
        System.out.println(c1.getCounter());
        c1.addN(4);
        System.out.println(c1.getCounter());

        SuperCounter c2 = new SuperCounter(5);
        System.out.println(c2.getCounter());

    }
}
