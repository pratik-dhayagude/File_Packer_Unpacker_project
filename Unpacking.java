//unpacking

import java.io.*;
import java.util.*;

class program614
{
    public static void main(String A[]) throws Exception
    {
      //variable creation
       int FileSize = 0;
       int i = 0;
       byte key = 0x11;
       int iRet = 0;

       Scanner sobj = null;
       String Filename = null;
       File fPackobj = null;
       FileInputStream fiobj = null;
       byte Bheader[] = new byte[100];
       String Header = null;
       String Tokens[] = null;
       File fobj = null;
       FileOutputStream foobj = null;
       byte Buffer[] = null;
       


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
        while(fiobj.read(Bheader,0,100)!=-1)
        {
         

          Header = new String(Bheader);
            
          Header = Header.trim();

          Tokens = Header.split(" ");
          System.out.println("Filename:"+Tokens[0]);
          System.out.println("FileSize:"+Tokens[1]);

          fobj=new File(Tokens[0]);
          fobj.createNewFile();

          foobj = new FileOutputStream(fobj);
          FileSize = Integer.parseInt(Tokens[1]);

          //Buffer for reading the data
          Buffer = new byte[FileSize];

          //Read from pack file
          fiobj.read(Buffer,0,FileSize);

          //Decrypet the data
          for(i = 0;i<FileSize;i++)
          {
            Buffer[i] = (byte)(Buffer[i]^key);
          }

          //Write into extracted file
          foobj.write(Buffer,0,FileSize);

        }
      
    }
}

      