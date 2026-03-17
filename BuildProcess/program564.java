import java.io.*;
import java.util.*;


class program562
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String Filename=null;
        FileReader frobj = null;

    

         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();
         File fobj = new File(Filename);
         if(fobj.exists())
         {

            frobj = new FileReader(Filename);

         }
         else
         {
             System.err.println("There is no such file");
         }
         
         if(frobj != null)
         {
             frobj.close();
         }
        
         sobj.close();
    }
}