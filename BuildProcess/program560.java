import java.io.*;
import java.util.*;


class program560
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         File fobj = null;
         String Filename=null;
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();

         fobj = new File(Filename);

         bRet = fobj.exists();

         if(bRet == true)
         {
            fobj.delete();
            System.out.println("File gets deleted succesfully");
           
         }
         else
         {
            System.out.println("There is no such file");
            
         }
         
         sobj.close();
    }
}