// Created by Nicolas Martinez 5/23/2017
package postnet;
import java.util.Scanner;

public class Postnet {

    private int zip;

    public static final char FB='\u2503',HB='\u257b';

    public static final String[] BARCODE = {

""+FB+FB+HB+HB+HB,

""+HB+HB+HB+FB+FB,

""+HB+HB+FB+HB+FB,

""+HB+HB+FB+FB+HB,

""+HB+FB+HB+HB+FB,

""+HB+FB+HB+FB+HB,

""+HB+FB+FB+HB+HB,

""+FB+HB+HB+HB+FB,

""+FB+HB+HB+FB+HB,

""+FB+HB+FB+HB+HB};

    public Postnet(int zipcode){

       this.zip = zipcode;

   }

public int getZip(){

return zip;

}

public void setZip(int z){

    zip= z;

}

public int checkdigitbarcode(){

       int digit = 0;

       for(int i = 0; i < 9;i++){

       digit += Array[i];

}

       digit %= 10;

       if(digit!= 0){

       digit = Math.abs(digit - 10);

       }

       return digit;

}

   

 

   

   

    

   public String barCode(){ 

       return FB+BARCODE[Array[0]]+BARCODE[Array[1]]+

              BARCODE[Array[2]]+BARCODE[Array[3]]+

              BARCODE[Array[4]]+BARCODE[Array[5]]+

              BARCODE[Array[6]]+BARCODE[Array[7]]+

              BARCODE[Array[8]]+BARCODE[checkdigitbarcode()]+FB; 

      

   }

 

   int[]Array = new int[9];

   int count = 0;

   public void breakDown(){

   int breakzip =zip;

   do{ Array[count] = breakzip%10;

   breakzip/=10;count++;

   }while(count<9);

  }







public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter zipcode ");

int zip = sc.nextInt();

Postnet pn = new Postnet(zip);

pn.breakDown();

System.out.print(pn.barCode());

}

}
