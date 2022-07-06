import java.util.Scanner;

abstract class Bank {

    public int i;

    public int j;


    abstract int getRateOfInterest();
    
}

class SBI extends Bank{
    
    int getRateOfInterest(){


        return 7;
    }
}

class PNB extends Bank{
    
    int getRateOfInterest(){

        return 8;
    }
    
}


class TestBank{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Bank b;

        b = new SBI();

        System.out.println("Rate OF Interest in SBI "+" "+b.getRateOfInterest()+" %");

        b = new PNB();

        System.out.println("Rate OF interest in PNB "+" "+b.getRateOfInterest()+" %");


    }
}