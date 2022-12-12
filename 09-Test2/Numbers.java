import java.util.Arrays;

public class Numbers {
    public int n1;
    public int n2;
    public int n3;
    public int n4;
    public int n5;

    public Numbers(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public boolean different(){
        int[] numbers ={n1,n2,n3,n4,n5};
        Arrays.sort(numbers);
        for (int i=1; i<numbers.length; i++){
            System.out.println(numbers[i-1]+", "+numbers[i]);
            if(numbers[i-1]==numbers[i]){
                return false;
            }
        }
        return true;
    }
}
