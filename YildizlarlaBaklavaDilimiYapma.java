package yildizlarlabaklavadilimiyapma;
import java.util.*;
public class YildizlarlaBaklavaDilimiYapma {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir sayı giriniz:");
       int sayi = input.nextInt();
       
       int i,k,l,m,j;
       for(i=1; i<=sayi; i++)
       {
           for(k=sayi; k>i; k--)
           {
               System.out.print(" ");
           }
           for(j=1; j<=i; j++)
           {
               System.out.print("*" + " ");
           }
           System.out.println();
       }
       
       for(k=1; k<=sayi; k++)
       {
           for(l=1; l<=k ; l++)
           {
               System.out.print(" ");
           }
           for(m=sayi; m>k; m--)
           {
               System.out.print("*" + " ");
           }
           System.out.println();
       }
       
       
    }
    
}
