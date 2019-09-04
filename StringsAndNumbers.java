/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;
import java.util.Random;

/**
 * @Author S536982
 * @author Venkata Siva Krishna Mohan Pratapa
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initializing the variables 
        
        String string1 = "    Welcome";
        String string2 = " to ";
        String string3 = "   Applied  ";
        String string4 = " Computer Science";
        String string5 = " at   ";
        String string6 = " Northwest ";
        
        // printing the above concatenated strings and length of concatenated 
        //string
        
        String string7 = string1.concat(string2).concat(string3).concat(string4)
                .concat(string5).concat(string6);
        System.out.println(string7); 
        System.out.println("The length of the concatenated string is :"
                + string7.length());
        
        // Printing the sentence with no spaces and an exclamation mark at 
        //the end of the sentence
        // and the length of the derived string
        
        String string8 = string1.trim().concat(" ").concat(string2.trim()).
                concat(" ").concat(string3.trim()).concat(" ").
                concat(string4.trim()).concat(" ").concat(string5.trim()).
                concat(" ").concat(string6.trim()).concat( "!" );
        
        System.out.println(string8);
        System.out.println("Length of the above string is:" + string8.length());
        
        // Retrieving the word Computer Science
        
        int i = string8.indexOf("Computer");
        int j = string8.indexOf("at")-1;
        String string9 = string8.substring(i,j);
        System.out.println("Retrieved:" + string9);
        
        // Conversion into lowercase and print the last index of "e"
        
       String string10 = string9.toLowerCase();
       System.out.println("Index of last e in 'computer science' is at: " +
               string10.lastIndexOf("e"));       
        
       //to print the index of the first occurrence of the word “Computer”.  
       
       String string11 = "computer Applied science Applied Computer science "
               + "science Applied computer Applied computer Science Applied "
               + "computer Applied" ;
       System.out.println("First occurrence of Computer is at:" + 
               string11.indexOf("Computer"));
       

        
        // Print “lab_activities_are_fun!”
        
        String string12 = "lab activities are fun!";
        System.out.println(string12);
        String string13 = string12.replaceAll(" ", "_");
        System.out.println(string13);
        
        //Print your own answer 
        
        System.out.println("With my prior experience in IT industry,"
                + " I would like to explore new technologies and go further "
                + "ahead of my career. Hence I choose ACS");
        
        
        
        // Math class
        
        int value1 = 18;
        int value2 = 4;
        double result = Math.pow(value1,value2);
        System.out.println("18 raised to the power of 4:"+ result);
        
        // print the value of secant 18
        
        System.out.println("sec (18):"+ 1/Math.cos(18));
        
        // print ceil and floor values
        double myNumber = 37.15;
        double m = Math.sqrt(myNumber);
        System.out.println("Square root of the 37.15 is: "+ m);
        
        // Ceil value
        System.out.println("Ceil Value of 37.15: "+ Math.ceil(myNumber));
        // Floor value
        System.out.println("Floor Value of 37.15: "+ Math.floor(myNumber));
        
        // print the value of cos 60° cos 45° + sin 60° sin 45°.
         System.out.println("cos 60° cos 45° + sin 60° sin 45° = " + 
                 Math.cos(60-45));
         
        // print theoretical value of tan (90)and print cubic root of |tan (90)|
        System.out.println("Theoretical value of tan (90):" + Math.tan(90));
        System.out.println("Cubic root of modulus value of tan(90) is:" +
                Math.cbrt(Math.abs(Math.tan(90))));
        
        
        // print the value of cosec(30) and sec(30) and find the maximum and
        //minimum of cosec(30) and sec(30).
        
        System.out.println("Cosecant of 30 is :" + 1/Math.sin(30));
        System.out.println("Secant of 30 is: "+ 1/Math.cos(30));
        System.out.println("Minimum value in Cosec(30) and Sec(30) is: " + 
                Math.min(1/Math.sin(30), (1/Math.cos(30))));
        System.out.println("Maximum value in Cosec(30) and Sec(30) is: " + 
                Math.max(1/Math.sin(30), (1/Math.cos(30))));
        
        // find the cosine and tangent for each variable. 
        //Print the rounded values for each result obtained.
        
        int myNumber1 = 45;
        int myNumber2 = 27;
        double a = Math.cos(myNumber1);
        double b = Math.tan(myNumber1);
        double c = Math.cos(myNumber2);
        double d = Math.tan(myNumber2);
        System.out.println("Rounded Value of cos 45: " + Math.round(a));
        System.out.println("Rounded Value of cos 27: " + Math.round(c));
        System.out.println("Rounded Value of tan 45: " + Math.round(b));
        System.out.println("Rounded Value of tan 27: " + Math.round(d));
        
        // Print the ceiling value of the result
        
              
        double N1 = Math.abs(6*1/Math.sin(myNumber1));
        double N2 = Math.pow((Math.pow(4,3)+9*(2)*(7)*5),1.0/4);
        double D1 = Math.pow(Math.pow(4,2)-Math.pow(2,2),1.0/8);
        double Result = N1*N2/D1;
        System.out.println("The value of the given equation is:" + (Result));
                  
            
        // Random class
        
        Random r = new Random();
        
        // 4 pseudo-random integer values between 0 (inclusive)
        //and 300 (exclusive)
        
        System.out.println("4 pseudo-random integer values between 0 (inclusive)"
                + " and 300 (exclusive)");
        
        System.out.println("First random integer value is: " + r.nextInt(300));
        System.out.println("Second random integer value is: " + r.nextInt(300));
        System.out.println("Third random integer value is: " + r.nextInt(300));
        System.out.println("Fourth random integer value is: " + r.nextInt(300)); 
        
        // 3 pseudo-random integer values without seed value and bounds
        
        System.out.println("3 pseudo-random integer values without seed value"
                + " and bounds");
        
        System.out.println("Fifth random integer value is: " + r.nextInt());
        System.out.println("Sixth random integer value is: " + r.nextInt());
        System.out.println("Seventh random integer value is: " + r.nextInt());
  
        System.out.println("Integers keep on changing each time when we hit the"
                + " execution as they are random numbers");
            
                 
        Random r2 = new Random(30L);
        
        // print 4 pseudo-random integer values between 0 (inclusive)
        //and 300 (exclusive)
        
        System.out.println("4 pseudo-random long values between 0 (inclusive) "
                + " and 300 (exclusive)");
        
        System.out.println("First random integer value is:" + r2.nextInt(300));
        System.out.println("Second random integer value is:" + r2.nextInt(300));
        System.out.println("Third random integer value is:" + r2.nextInt(300));
        System.out.println("Fourth random integer value is:" + r2.nextInt(300));
        
        System.out.println("Long values were same all the times when executed");
        
         // print 3 random values without passing any integer values. 
         
         System.out.println("3 pseudo-random long values with seed value "
                 + " and without bounds");
         
        System.out.println("Fifth random long integer value is: "+
                r2.nextInt());
        System.out.println("Sixth random long integer value is: "+ 
                r2.nextInt());
        System.out.println("Seventh random long integer value is: "+ 
                r2.nextInt());
        
        System.out.println("Long values remained same for every execution");
        
        System.out.println("In comparison with the integers execution and "
              + "long execution,"
            + " the values were changing for integers as we have "
          + "used the random methods."
        + " However, for long when we execute the values remain same");
        
    }
    
}
