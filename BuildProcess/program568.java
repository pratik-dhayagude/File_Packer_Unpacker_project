import java.io.*;
import java.io.*;
import java.util.*;


class program568    
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String Filename=null;
         

    

         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();
         File fobj = new File(Filename);
         if(fobj.exists())
         {
             System.out.println("File neme:"+fobj.getName());
             System.out.println("File path:"+fobj.getAbsolutePath());
             System.out.println("File Size:"+fobj.length());
         }
         else
         {
             System.err.println("There is no such file");
         }  
         sobj.close();
    }
}