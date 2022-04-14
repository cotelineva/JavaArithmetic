import java.util.Arrays;
import java.util.List;

public class aufgabe4 {
    public static void main(String[] args){
        //1
        System.out.print("Billigste Tastatur: ");
        int[] t = new int[]{40,35,70,15,45,10};
        Gegenstand g = new Gegenstand(); //tast
        g.setPreis(t);
        g.setTyp("Tastatur");
        System.out.println(g.cheap_keyboard());
        //2
        System.out.print("Teuersten Gegenstand: ");
        int[] t1 = new int[]{15,20,10,35,50};
        int[] usb1 = new int[]{20,15,40,15};
        Gegenstand g1 = new Gegenstand(); //tast
        Gegenstand g2 = new Gegenstand(); //usb
        g1.setTyp("Tastatur");
        g1.setPreis(t1);
        g2.setTyp("USB");
        g2.setPreis(usb1);
        System.out.println(g1.teuerstenG(g2));
        //3
        int b = 30;
        System.out.print("Teuerste USB mit " + b + " budget: ");
        int[] u2 = new int[]{15,45,20,25};
        Gegenstand g3 = new Gegenstand(); //usb
        g3.setPreis(u2);
        g3.setTyp("USB");
        System.out.println(g3.USBmitBudget(b));
        //4
        int b1 = 60;
        System.out.print("Maximalen Geldbetrag fur beiden Gegenstande, mit budget " + b1 +": ");
        int[] t2 = new int[]{40,60}; //tastaturen
        int[] u3 = new int[]{8,12,19}; //usb
        Gegenstand g5 = new Gegenstand();
        Gegenstand g4 = new Gegenstand();
        g5.setTyp("Tastatur");
        g5.setPreis(t2);
        g4.setTyp("USB");
        g4.setPreis(u3);
        System.out.println(g4.max_geldbetrag(g5,b1));
    }
}

class Gegenstand{
    private String typ;
    private int[] preis;

    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public int[] getPreis() {
        return preis;
    }
    public void setPreis(int[] preis) {
        this.preis = preis;
    }

    //1
    public int cheap_keyboard(){
        int min = 999999;
        if(this.getTyp() == "Tastatur"){
            for(int i = 0; i < this.getPreis().length; i++){
                if(this.getPreis()[i] < min)
                    min = this.getPreis()[i];
            }
        }
        else{
            System.out.println("Gegenstand ist keine Tastatur!");
            return -1;
        }
        return min;
    }

    //2
    public int teuerstenG(Gegenstand g2){
        int max1 = 0, max2 = 0;

        //fur den ersten gegenstand
        for(int i = 0; i < this.getPreis().length; i++){
            if(this.getPreis()[i] > max1)
                max1 = this.getPreis()[i];
        }

        //fur den zweiten gegenstand
        for(int i = 0; i < g2.getPreis().length; i++){
            if(g2.getPreis()[i] > max2)
                max2 = g2.getPreis()[i];
        }

        if(max1 > max2){
            return max1;
        }
        else{
            return max2;
        }
    }

    //3
    public int USBmitBudget(int b){
        int max = 0;
        if(this.getTyp() == "USB"){
            for(int i = 0; i < this.getPreis().length; i++){
                if(this.getPreis()[i] > max && this.getPreis()[i] <= b){
                    max = this.getPreis()[i];
                }
            }
        }
        else{
            System.out.println("Gegenstand ist kein USB!");
            return -1;
        }
        return max;
    }

    //4
    public int max_geldbetrag(Gegenstand tast, int b){
        int sum, max_sum = 0;

        for(int i = 0; i < this.getPreis().length; i++){
            for(int j = 0; j < tast.getPreis().length; j++){
                sum = this.getPreis()[i] + tast.getPreis()[j];
                if(sum > max_sum && sum <=b){
                    max_sum = sum;
                }
                sum = 0;
            }
        }
        if(max_sum != 0){
            return max_sum;
        }
        else {
            return -1;
        }
    }
}
