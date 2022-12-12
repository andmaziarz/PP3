public class Counter{
    private int counter = 0;

    public int value(){
        return counter;
    }

    public void increase(int n){
        this.counter+=n;
    }

    public void increase(){
        this.counter+=1;
    }

    public void decrease(){
        this.counter-=1;
    }

    public void decrease(int n){
        this.counter-=n;
    }
    
}