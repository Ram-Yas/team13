import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        String  btnkelime = (String) dp.nextLine();

        String[] liste = btnkelime.split(" ");

        String s1 = liste[0];

        String s2 = liste[1];




        if(s1.substring(s1.length()-1).equals(s2.substring(0,1))){
            String s3=s1.replace(s1.substring(s1.length()-1),"");
            System.out.println(s3+s2);
        }else{
            System.out.println(s1+s2);
        }



    }



    }

