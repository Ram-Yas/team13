import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


     /*
     3 tane pozitif String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





    */
  
    public static  void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];
        String num4;

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

        num1=num1.replaceAll("\\D","");
        num2=num2.replaceAll("\\D","");
        num3=num3.replaceAll("\\D","");

        int number1=Integer.parseInt(num1);
        int number2=Integer.parseInt(num2);
        int number3=Integer.parseInt(num3);

        int total=number1+number2+number3;

        if (total>0){
            System.out.println(total);
        }else if (total<0){
            System.out.println("-1");
        }








        }


    }

