import java.io.*;
import java.util.*;


class program575
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String Filename=null;
         byte Buffer[] = new byte[100];
         int iRet = 0;
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();
         File fobj = new File(Filename);
         if(fobj.exists())
         {
            String str = null;
            FileInputStream fiobj = new FileInputStream(fobj);
            while((iRet=fiobj.read(Buffer)) != -1)
            { 
                str = new String(Buffer);
                System.out.print(str);
                str = null;
            }
            System.out.println();
        
         }
         else
         {
             System.err.println("There is no such file");
         }  
         sobj.close();
    }
}