/* 
Here are some arithmetic operations on numbers displayed on arrays.
*/

public class aufgabe3 {
    public static void main(String[] args){
        int[] a = new int[]{8,5,4,3,6};
        int[] b = new int[]{2,4,4,2,6};
        int[] c = new int[a.length + 1];
        int[] d = new int[a.length + 1];
        int[] e = new int[a.length + 1];
        int[] f = new int[a.length + 1];
        ub3 o = new ub3();

        //suma
        c = o.sum(a,b,c);
        System.out.print("Suma: ");
        if(c[0] != 0)
            System.out.print(c[0]);
        for(int i = 1; i < c.length; i++){
                System.out.print(c[i]);
        }

        //diferenta
        System.out.println();
        d = o.diff(a,b,d);
        System.out.print("Diferenta: ");
        if(d[0] != 0)
            System.out.print(d[0]);
        for(int i = 1; i < d.length; i++){
            System.out.print(d[i]);
        }

        //inmultire
        System.out.println();
        e = o.mul(a,e,2);
        System.out.print("Inmultirea: ");
        if(e[0] != 0)
            System.out.print(e[0]);
        for(int i = 1; i < e.length; i++){
            System.out.print(e[i]);
        }

        //impartire
        System.out.println();
        f = o.div(b,f,2);
        System.out.print("Impartirea: ");
        if(f[0] != 0)
            System.out.print(f[0]);
        for(int i = 1; i < f.length; i++){
            System.out.print(f[i]);
        }

    }
}

class ub3{
    //1
    public int[] sum(int a[], int b[], int c[]){
        int rest = 0;
        for(int i = a.length - 1; i >= 0; i--){

            //pentru suma cifrelor mai mica decat 10
            if(a[i] + b[i] < 10 && rest == 0){
                c[i + 1] = a[i] + b[i];
            }
            if(a[i] + b[i] < 10 && rest != 0){
                if((a[i] + b[i] + rest) >= 10) {
                    c[i + 1] = (a[i] + b[i] + rest) % 10;
                    rest = (a[i] + b[i] + rest) / 10;
                    continue;
                }
                else{
                    c[i + 1] = a[i] + b[i] + rest;
                    rest = 0;
                    continue;
                }
            }

            //pentru suma cifrelor mai mare decat 10
            if(a[i] + b[i] >= 10 && rest == 0) {
                if(i == 0){
                    c[i + 1] = (a[i] + b[i]) % 10;
                    rest = (a[i] + b[i]) / 10;
                    c[0] = rest;
                    continue;
                }
                else{
                    c[i + 1] = (a[i] + b[i]) % 10;
                    rest = (a[i] + b[i]) / 10;
                    continue;
                }
            }
            if(a[i] + b[i] >= 10 && rest != 0){
                if(i == 0){
                    c[i + 1] = (a[i] + b[i] + rest) % 10;
                    rest = (a[i] + b[i]) / 10;
                    c[0] = rest;
                }
                else {
                    c[i + 1] = (a[i] + b[i] + rest) % 10;
                    rest = (a[i] + b[i] + rest) / 10;
                }
            }
        }
        return c;
    }
    //2
    public int[] diff(int a[], int b[], int c[]){
        for(int i = a.length - 1; i >= 0; i--){
            c[i + 1] = a[i] - b[i];
        }
        return c;
    }
    //3
    public int[] mul(int a[], int b[], int nr){

        int rest = 0;
        for(int i = a.length - 1; i >= 0; i--){
            if(a[i] * nr < 10 && rest == 0){
                b[i + 1] = a[i] * nr;
            }
            if(a[i] * nr < 10 && rest != 0){
                b[i + 1] = a[i] * nr ;
                if((a[i] * nr + rest) >= 10) {
                    b[i + 1] = (a[i] * nr + rest) % 10;
                    rest = (a[i] * nr + rest) / 10;
                    continue;
                }
                else{
                    b[i + 1] = a[i] * nr + rest;
                    rest = 0;
                    continue;
                }
            }
            if(a[i] * nr >= 10 && rest == 0){
                if(i == 0){
                    b[i + 1] = (a[i] * nr) % 10;
                    rest = (a[i] * nr) / 10;
                    b[0] = rest;
                }
                else{
                    b[i + 1] = (a[i] * nr) % 10;
                    rest = (a[i] * nr) / 10;
                    continue;
                }
            }
            if(a[i] * nr >= 10 && rest != 0){
                if(i == 0){
                    b[i + 1] = (a[i] * nr + rest) % 10;
                    rest = (a[i] * nr) / 10;
                    b[0] = rest;
                }
                else {
                    b[i + 1] = (a[i] * nr + rest) % 10;
                    rest = (a[i] * nr + rest) / 10;
                }
            }

        }
        return b;
    }
    //4
    public int[] div(int a[], int b[], int nr){
        for(int i = a.length - 1; i >= 0; i--){
            b[i + 1] = a[i] / nr;
        }
        return b;
    }
}
