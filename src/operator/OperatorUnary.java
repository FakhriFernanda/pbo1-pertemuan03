package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++ ;                   // i tadinya 0 ditambah 1 sehingga i=1
        System.out.println(i);  // output i setelah ditambah 1
        i++;                    // karena i tadinya sudah bernilai 1 maka sekarang ditambahkan 1 lagi menjadi 2
        System.out.println(i);  // output i setelah ditambah 1 (lagi)
        i=i+1;                  // bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);  // i tadi 2 menjadi 3

        //berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3; //sama dengan i= i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; //sama dengan i=i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }
}
