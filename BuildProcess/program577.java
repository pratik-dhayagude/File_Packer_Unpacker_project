import java.io.*;
import java.util.*;


class program577
{
   
    public static void main(String A[]) throws Exception
    {
         boolean bRet = false;
         String FilenameSrc = null;
         String FilenameDest = null;

         byte Buffer[] = new byte[1024];
         int iRet = 0;

         File fobjSrc = null;
         File fobjDest = null;
         String str = null;

         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the file name of Source file:");
         FilenameSrc = sobj.nextLine();

         System.out.println("Enter the file name of Destination file:");
         FilenameDest = sobj.nextLine();

         fobjSrc = new File(FilenameSrc);
         if(fobjSrc.exists())
         {
            fobjDest = new File(FilenameDest);
            fobjDest.createNewFile();

            FileOutputStream foobj = new FileOutputStream(fobjDest);

            FileInputStream fiobj = new FileInputStream(fobjSrc);

            while((iRet=fiobj.read(Buffer)) != -1)
            {
                //System.out.print(str);
                foobj.write(Buffer,0,iRet);
                
            }
            System.out.println("File copy succesfully");
            fiobj.close();
            foobj.close();
         }
         else
         {
             System.err.println("There is no source file");
         }  
         sobj.close();
    }
}