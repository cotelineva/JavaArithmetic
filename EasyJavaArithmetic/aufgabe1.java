import java.util.Arrays;

/*
A teacher wants to calculate the grades of students to see which students pass and fail.
In this exercise I calculated:
    insuficient - the grades that do not pass the exams
    durchschnitt - the average of all the grades
    abgerundet - the grades rounded up
    max_round - the greatest rounded grade
*/

public class aufgabe1 {

    public static void main(String[] args){
        ub1 obj = new ub1();
        int[] x = new int[8];

        //1
        System.out.print("Nichtausreichende noten sind: ");
        x = obj.insuficient(new int[] {23, 45, 87, 62, 94, 90, 74, 39});

        for(int i = 0; i < x.length; i++) {
            if (x[i] != 0) {
                System.out.print(x[i]);
                System.out.print(" ");
            }
        }
        System.out.println();

        //2
        System.out.print("Durchschnitt der noten ist: ");
        System.out.println(obj.durchsnitt(new int[] {23, 45, 87, 62, 94, 90, 74, 39}));

        //3
        System.out.print("Die abgerundeten noten sind: ");
        x = obj.abgerundet(new int[] {23, 45, 87, 62, 94, 90, 74, 39});
        for(int i = 0; i < x.length; i++) {
            if (x[i] != 0) {
                System.out.print(x[i]);
                System.out.print(" ");
            }
        }
        System.out.println();

        //4
        System.out.print("Die maximale abgerundete Note ist: ");
        System.out.println(obj.max_round(new int[] {23, 45, 87, 62, 94, 90, 74, 39}));
        System.out.println();
    }
}

class ub1{
    //1
    public int[] insuficient(int n[]){

         int not_enough[] = new int[n.length];
         int k = 0;
         for(int i = 0; i < n.length; i++){
             if(n[i] < 40){
                 not_enough[k] = n[i];
                 k++;
             }
         }
         return not_enough;
    }
    //2
    public double durchsnitt(int n[]){

        double sum = 0;
        for(int i = 0; i < n.length; i++){
            sum += n[i];
        }

        return sum/n.length;
    }
    //3
    public int[] abgerundet(int n[]){

        int x;
        for(int i =  0; i < n.length; i++){
            if(n[i] > 38){
                if(n[i] % 5 != 0){
                    x = n[i];
                    while(x % 5 != 0){
                        x++;
                    }
                    if(x - n[i] < 3){
                        n[i] = x;
                    }
                }
            }
        }
        return n;
    }
    //4
    public int max_round(int n[]){
        ub1 o = new ub1();
        o.abgerundet(n);

        int max = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] > max)
                max = n[i];
        }
        return max;
    }
}
