import java.util.Scanner;

public class countE {

    /**
     *  merhaba arkadaslar.
     */


/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


    //hint: .charAt, length(), for, index, counter,



    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */


    //hint: .charAt, length(), for, index, counter,


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();

        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='b'){
                sayac++;
            }
        }
        System.out.println("Girdiginiz metindeki 'b' karakteri adedi = " + sayac);


    }

}
