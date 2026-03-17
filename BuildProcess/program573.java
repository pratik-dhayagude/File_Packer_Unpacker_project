import java.io.*;
import java.util.*;


class program573
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String Filename=null;
         byte Arr[] = new byte[100];
         int iRet = 0;
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();
         File fobj = new File(Filename);
         if(fobj.exists())
         {
            FileInputStream fiobj = new FileInputStream(fobj);
            

            iRet = fiobj.read(Arr);
            String str = new String(Arr);
            System.out.println(iRet=+iRet);
            System.out.println(str);

            
         }
         else
         {
             System.err.println("There is no such file");
         }  
         sobj.close();
    }
}