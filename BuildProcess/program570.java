import java.io.*;
import java.io.*;
import java.util.*;


class program570
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
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";
            byte Arr[] = str.getBytes();

            foobj.write(Arr);
            System.out.println("Length of arr is:"+Arr.length);
         }
         else
         {
             System.err.println("There is no such file");
         }  
         sobj.close();
    }
}