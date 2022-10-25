public class CinemaTicket
{
    static String cinemaName = "the Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public void displayTicket(){
        System.out.println("\nKino: "+cinemaName);
        System.out.println("Film: "+filmTitle);
        System.out.println("Rzad: "+row);
        System.out.println("Miejsce: "+seat);
        System.out.println("Cena: "+price+" zł");
    }
    
    public static void main(String[] args){

        CinemaTicket t3 = new CinemaTicket("Gladiator", 2, 10);

        t3.displayTicket();

        CinemaTicket t4 = new CinemaTicket("Gladiator", 7, 18);

        t4.displayTicket();
        
    }

    //konstruktor (ma tą samą nazwę co klasa)
    public CinemaTicket(String t, int r, int s){
        filmTitle = t;
        row = r;
        seat = s;
        if(row<=2){
            price = 10.00;
        }else{
            price = 25.00;
        }
    }
}
