import java.util.Scanner;

class Farmer{
    float pa; // --> principal amount
    float td; // --> time duration
    static float ri; // --> rate of interest
    float si; // --> simple interest
    static {
        ri=2.5f;
    }
    public void input(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the principal amount required: ");
        pa = scan.nextFloat();
        System.out.println("Please enter the time duration");
        td= scan.nextFloat();

    }

    public void compute(){
        si=(pa*td*ri)/100;
    }

    public void disp(){
        System.out.println("SI is: " + si);
    }
}

class Display{
    public void displaySI(Farmer farmer){
        farmer.input();
        farmer.compute();
        farmer.disp();
    }
}

public class LoanApplication {
    public static void main(String[] args) {
        System.out.println("Farmer Loan Application: ");
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        Farmer f3 = new Farmer();
        Display disp = new Display();
        disp.displaySI(f1);
        disp.displaySI(f2);
        disp.displaySI(f3);
    }
}
