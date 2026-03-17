//unpacking

import java.io.*;
import java.util.*;

class program609
{
    public static void main(String A[]) throws Exception
    {
      //variable creation
       Scanner sobj = null;
       String Filename = null;
       File fPackobj = null;
       FileInputStream fiobj = null;
       byte Bheader[] = new byte[100];
       String Header = null;
       String Tokens[] = null;
       File fobj = null;


       sobj = new Scanner(System.in);

       System.out.println("Enter the name of pack file");
       Filename = sobj.nextLine();

        fPackobj = new File(Filename);

        if(fPackobj.exists()==false)
        {
          System.out.println("Error:There is no such pack file");
          return;   
        }

        fiobj = new FileInputStream(fPackobj);
         
        //Read they headder

        fiobj.read(Bheader,0,100);

        Header = new String(Bheader);
          
        Header = Header.trim();

        Tokens = Header.split(" ");
        System.out.println("Filename:"+Tokens[0]);
        System.out.println("FileSize:"+Tokens[1]);

        fobj=new File(Tokens[0]);
        fobj.createNewFile();



    }
}

      