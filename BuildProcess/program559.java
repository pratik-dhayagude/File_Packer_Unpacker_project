import java.io.*;
import java.util.*;


class program559
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
            System.out.println("File is already preasent");
         }
         else
         {
            bRet=fobj.createNewFile();
            if(bRet == true)
            {
                System.out.println("File gets created succesfully");
            }
            else
            {
                System.out.println("Unable to create the file");
            } 

         }
         
         sobj.close();
    }
}