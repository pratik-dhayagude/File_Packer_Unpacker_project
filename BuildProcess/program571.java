import java.io.*;
import java.io.*;
import java.util.*;


class program571
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
            FileInputStream fiobj = new FileInputStream(fobj);
            byte Arr[] = new byte[50];

            fiobj.read(Arr);

            System.out.println(Arr);

            
         }
         else
         {
             System.err.println("There is no such file");
         }  
         sobj.close();
    }
}