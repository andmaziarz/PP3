import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> products = new ArrayList<Product>();
    public void add(Product product){
        products.add(product);
    }

    public String toString(){
        String list="";
        for(int i=0;i<products.size();i++){
            list+=products.get(i).getName()+",";
        }
        list=list.substring(0, list.length()-1);
        return list;
    }

    public int total(){
        int sum = 0;
        for (int i= 0;i<products.size();i++){
            sum+=products.get(i).getQuantity();
        }

        return sum;
    }

    public static void main(String[] args) {
        Product p1 = new Product("apple", 4);
        Product p2 = new Product("milk", 2);
    
        ShoppingList s1 = new ShoppingList();
        s1.add(p1);
        s1.add(p2);
        System.out.println(s1.toString());
        System.out.println(s1.total());
    }
}


