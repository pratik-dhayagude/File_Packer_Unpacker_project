import java.io.*;
import java.util.*;

class program605
{
    public static void main(String A[]) throws Exception
    {
         String Header = null;

         byte key = 0x11;
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter the name of folder");
         String FolderName = sobj.nextLine();

         int iRet = 0;
         int i = 0;
         int j = 0;

         byte Buffer[] = new byte[1024];
         byte Bheader[] = new byte[100];

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

            for(i = 0;i<fArr.length;i++)
            {
               fiobj = new FileInputStream(fArr[i]);

               if(fArr[i].getName().endsWith(".txt"))
               {
                  //Header formation
                  Header = fArr[i].getName() + " " + fArr[i].length();
                  for(j = Header.length();j<100;j++)
                  {
                     Header = Header + " ";
                  }
                   
                  Bheader = Header.getBytes();

                  foobj.write(Bheader,0,100)
;
                    /*while((iRet=fiobj.read(Buffer))!=-1)
                     {
                        //Encryption 
                        for(j=0;j<iRet;j++)
                        {
                            Buffer[j] = (byte)(Buffer[j]^key);
                        }
                        foobj.write(Buffer,0,iRet);
                     }*/
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
      