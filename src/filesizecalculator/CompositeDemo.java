import java.util.Scanner;

public class CompositeDemo {
  public static final String SEPARATOR = ", ";

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in); 
    String dir_address;
    System.out.print("Enter your Directory address: ");
    dir_address= a.next();
    
    FileSystemComponent mainDirectory = new DirComponent(dir_address);
    
   
    System.out.println("The size of our directory is: "+mainDirectory.getComponentSize()+"KB");
    
    
      
    /*FileSystemComponent mainFolder = new DirComponent("Year2000");
    
    FileSystemComponent subFolder1 = new DirComponent("Jan");

    FileSystemComponent subFolder2 = new DirComponent("Feb");


    FileSystemComponent folder1File1 =
      new FileComponent("Jan1DataFile.txt",1000);
    FileSystemComponent folder1File2 =
      new FileComponent("Jan2DataFile.txt",2000);
    FileSystemComponent folder2File1 =
      new FileComponent("Feb1DataFile.txt",3000);
    FileSystemComponent folder2File2 =
      new FileComponent("Feb2DataFile.txt",4000);

    try {
      mainFolder.addComponent(subFolder1);
      mainFolder.addComponent(subFolder2);
      subFolder1.addComponent(folder1File1);
      subFolder1.addComponent(folder1File2);
      subFolder2.addComponent(folder2File1);
      subFolder2.addComponent(folder2File2);
    } catch (CompositeException ex) {
      //
    }

    //Client refers to both composite &
    //individual components in a uniform manner
    System.out.println(" Main Folder Size= " +
                       mainFolder.getComponentSize() + "kb");
    System.out.println(" Sub Folder1 Size= " +
                       subFolder1.getComponentSize() + "kb");
    System.out.println(" File1 in Folder1 size= " +
                       folder1File1.getComponentSize() + "kb");
*/
  }
}
