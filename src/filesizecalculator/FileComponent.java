import java.util.*;

public class FileComponent extends FileSystemComponent {
  private long size;

  public FileComponent(String cName) {
    super(cName);
    
    java.io.File file = new java.io.File(cName);
    size= file.length();

     
  }

  public long getComponentSize() {
    return size;
  }

} // End of class

