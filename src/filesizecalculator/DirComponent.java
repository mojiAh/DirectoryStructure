import java.util.*;
import java.io.File;


public class DirComponent extends FileSystemComponent {
  Vector dirContents = new Vector();
  int numberOfFiles=0;
  int numberOfSubdirectories=0;
  //individual files/sub folders collection

  public DirComponent(String cName) {
    super(cName);
    FileSystemComponent current;
    File f = new File(cName);
    for (File file : f.listFiles()) {
        String path= file.getAbsolutePath();
        if (file.isFile()){
            current= new FileComponent(path);
        numberOfFiles=numberOfFiles++;}
        else{
            current= new DirComponent(path);
            numberOfSubdirectories=numberOfSubdirectories++;}
        
        dirContents.add(current);
           
    }
  }

  public void addComponent(FileSystemComponent fc)
  throws CompositeException {
    dirContents.add(fc);
  }

  public FileSystemComponent getComponent(int location)
  throws CompositeException {
    return (FileSystemComponent) dirContents.elementAt(
             location);
  }

  public long getComponentSize() {
    long sizeOfAllFiles = 0;
    Enumeration e = dirContents.elements();
    while (e.hasMoreElements()) {
      FileSystemComponent component =
        (FileSystemComponent) e.nextElement();
      sizeOfAllFiles = sizeOfAllFiles +
                       (component.getComponentSize());
    }
    return sizeOfAllFiles;
  }
  
  public int getNumberOfFiles(){
  return numberOfFiles;
  }
  
  public int getNumberOfSubdirectorie(){
  return numberOfSubdirectories;
  }
    
} // End of class

