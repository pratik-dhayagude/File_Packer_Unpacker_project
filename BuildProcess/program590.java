import java.io.*;
import java.util.*;


class program589
{
    public static void main(String A[]) throws Exception
    {
      
         Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the name of folder");
         String FolderName = sobj.nextLine();
         int iRet = 0;
         byte Buffer[] = new byte[1024];

         System.out.println("Enter the name of Packed file:");
         String PackName = sobj.nextLine();

         File fobj = new File(FolderName);
         if((fobj.exists())&&(fobj.isDirectory()))
         {
            File packobj = new File(PackName);
            packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(packobj);

            FileInputStream fiobj = null;

            System.out.println("Folder is preasent");
            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in folder are:"+fArr.length);

            for(int i = 0;i<fArr.length;i++)
            {
               fiobj = new FileInputStream(fArr[i]);
               System.out.println("FileName:"+fArr[i].getName()+"File Size:"+fArr[i].length()+"Bytes");
               if(fArr[i].getName().endsWith(".txt"))
               {
                     while((iRet=fiobj.read(Buffer))!=-1)
                     {
                        foobj.write(Buffer,0,iRet);
                     }
               }
               fiobj.close();   
            }
            foobj.close();
         }
         else
         {
            System.out.println("There is no such folder");
         }
         sobj.close();
    }
}