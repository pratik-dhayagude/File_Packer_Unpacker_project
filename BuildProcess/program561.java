import java.io.*;
import java.util.*;


class program561
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String Filename=null;
    

         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name");
         Filename = sobj.nextLine();
              FileWriter fwobj = new FileWriter(Filename);
        
         sobj.close();
    }
}