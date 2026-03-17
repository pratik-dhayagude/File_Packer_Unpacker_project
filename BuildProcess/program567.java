import java.io.*;
import java.util.*;


class program567
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
            
            char Buffer[] = new char[50];

            frobj.read(Buffer,0,13);
            System.out.println("Data from file is "+new String(Buffer)); 

              

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