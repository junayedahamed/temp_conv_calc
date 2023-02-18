
import java.util.*;

public class Main {
    public static void main(String[] args) {


        char ch1,ch2;
       float cel,far,kel,x=0;

        Scanner scan=new Scanner(System.in);


        System.out.print("enter from : ");


        ch1=scan.next().charAt(0);

        System.out.print(" to ");
        ch2=scan.next().charAt(0);

        if(ch1=='c'){
            System.out.print(" enter temp in "+ch1+": ");
            cel= scan.nextFloat();
            x=cel;
        }
        if(ch1=='f'){
            System.out.print(" enter temp in "+ch1+": ");
            far= scan.nextFloat();
            x=far;
        }
        if(ch1=='k'){
            System.out.print(" enter temp in "+ch1+": ");
            kel= scan.nextFloat();
            x=kel;
        }



        System.out.println("tempareture in "+ch2+" is "+ convert(ch1, ch2, x));

    }

    //converter function

    static float convert(char ch1,char ch2,float x){
        if (ch1=='c'&&ch2=='f') {

           float far;
            return far = ((9 * x) / 5) + 32;

        }

        if (ch1=='c'&&ch2=='k'){
            float kel;
            return  kel=(float) (x+273.15);

        }
        if(ch1=='f'&&ch2=='c'){

            float cel;

            return  cel=(5*(x-32)/9);
        }

        if(ch1=='f'&&ch2=='k'){

            float kel;

          return   kel= (float) (((x-32)*5/9)+273.15);
        }

        if (ch1=='k'&&ch2=='c'){
            float cel;

            return  cel=(float) (x-273.15);


        }

        if (ch1=='k'&&ch2=='f'){
            float far;

            return  far=(float) ((x-273.15)*9/5)+32;
        }

        return  x;
    }
}