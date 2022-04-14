public class aufgabe2 {
    public static void main(String[] args){
        ub2 o = new ub2();
        int[] nr = new int[]{4, 8, 3, 10, 17};

        System.out.print("Numarul maxim este: ");
        System.out.println(o.max(nr,5));
        System.out.print("Numarul minim este: ");
        System.out.println(o.min(nr,5));
        System.out.print("Suma maxima este: ");
        System.out.println(o.max_sum(nr,5));
        System.out.print("Suma minima este: ");
        System.out.println(o.min_sum(nr,5));
    }
}

class ub2{
    //1
    public int max(int nr[], int n){
        int max = 0;
        for(int i = 0; i < n; i++){
            if(nr[i] > max){
                max = nr[i];
            }
        }
        return max;
    }
    //2
    public int min(int nr[], int n){
        int min = 99999;
        for(int i = 0; i < n; i++){
            if(nr[i] < min){
                min = nr[i];
            }
        }
        return min;
    }
    //3
    public int max_sum(int nr[], int n){

        int min = 99999, j = 0, sum_max = 0;

        for(int i = 0; i < n; i++){
            if(nr[i] < min){
                min = nr[i];
                j = i;
            }
        }

        for(int i = 0; i < n; i++){
            if(i != j){
                sum_max += nr[i];
            }
        }
        return sum_max;
    }
    //4
    public int min_sum(int nr[], int n){

        int max = 0, j = 0, sum_min = 0;

        for(int i = 0; i < n; i++){
            if(nr[i] > max){
                max = nr[i];
                j = i;
            }
        }

        for(int i = 0; i < n; i++){
            if(i != j){
                sum_min += nr[i];
            }
        }
        return sum_min;
    }
}