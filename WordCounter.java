import java.util.Scanner;
import java.io.*;

class WordCounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Would you like to insert a file or type some text Enter('F' for file:'T' for text:'E' for exit):");
        while(true){
        String s=sc.nextLine();
        if(s.equals("E")){
        System.out.println("Exited");
        break;
        }
        else if(s.equals("F")){
        int count=0;
        System.out.print("Enter the file name:"); 
        String n=sc.next();
        try{
        File myfile=new File(n);
        Scanner readfile=new Scanner(myfile);
        while(readfile.hasNextLine()){
        String data=readfile.nextLine();
       String b[]=data.split("[:; -,!.'?{}()\"*]+",0);
       for(String i:b)
        count=count+i.length();
        }
        readfile.close();
        }
        catch(Exception e){
            System.out.println("Please check whether the file is present");
        }
        System.out.println("The number of characters present in the file are: "+count);
        System.out.print("Would you like to insert a file or type some text Enter('F' for file:'T' for text:'E' for exit):");
        }
       else if(s.equals("T")){
        int count=0;
        System.out.print("Enter the text here: ");
        String user_input=sc.nextLine();
        String arr[]=user_input.split("[:; -,!.'?{}()\"*]+");      
        for(String i:arr){
            count=count+i.length();
        }
         System.out.println("The number of characters typed are: "+count);
         System.out.print("Would you like to insert a file or type some text Enter('F' for file:'T' for text:'E' for exit):"); 
        }        
      }
       

        sc.close();
    }
}