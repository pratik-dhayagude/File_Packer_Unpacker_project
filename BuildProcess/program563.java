import java.io.*;
import java.util.*;


class program562
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String Filename=null;
    

         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();
         FileReader frobj = new FileReader(Filename);
         

        
         frobj.close();
         sobj.close();
    }
}