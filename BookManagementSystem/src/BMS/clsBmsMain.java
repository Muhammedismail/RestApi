package BMS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class clsBmsMain {

	public static void  main(String[] args) 
	{
		try
		{
	    Scanner scanner = new Scanner(new File("E:/JAVA-ECLIPSE/BookManagementSystem/Data/buecher.csv"));	
	    //String sBooks=	scanner.next();
	    StringBuilder str = new StringBuilder() ; 
	    String s ="";
	    String s1 ="";
		String regExp = "[ü ä\\-ßa-z0-9]+[;]\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d;+pr+[-]+[A-Z]+@+[a-z]+.de[;,\\s]|[pr]+[-]+[A-Z]+[@]+[a-z]+.de[;,]" ;
		String regExp1 = "\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d;pr[-]+[a-z,A-Z]+@+[A-Z,a-z]+.de+[,;]|pr[-]+[a-z,A-Z]+@+[A-Z,a-z]+.de+[,;]" ;
		//System.out.print(regExp);
		//System.out.print(regM.group(0));
		//System.out.print(sBooks);
       // scanner.useDelimiter(";");
       // scanner.nextLine();
        while(scanner.hasNext()){
           //System.out.print(scanner.next() + "***" );
         s=scanner.next();
          str.append(s);
        }
        scanner.close();
       //System.out.print(str.toString());
       Pattern regP = Pattern.compile(regExp1); 
       System.out.print(str.toString());
	   Matcher regM = regP.matcher(str.toString());
       System.out.print(regM.toString());
          if(regM.find())
          {
        	  System.out.print(true);
        	  System.out.print("\n"+ regM.groupCount());
        	  System.out.print("\n"+ regM.group());
          }
          else {
        	  System.out.print(false);
          }
          
          
	  
		
		}
		catch(FileNotFoundException e) 
		{
		 e.printStackTrace();
		}
	
	}

}
