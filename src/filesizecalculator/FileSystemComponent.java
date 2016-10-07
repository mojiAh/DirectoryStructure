import java.util.*;


public abstract class FileSystemComponent {
  String name;

  public FileSystemComponent(String cName) {
    name = cName;
  }
  public void addComponent(FileSystemComponent component)
  throws CompositeException {
    throw new CompositeException(
      "Invalid Operation. Not Supported");
  }
  public FileSystemComponent getComponent(int componentNum)
  throws CompositeException {
    throw new CompositeException(
      "Invalid Operation. Not Supported");
  }

  public abstract long getComponentSize();
  
  public int getNumberOfFiles()
  throws CompositeException {
    throw new CompositeException(
      "Invalid Operation. Not Supported");
  };
  
  public int getNumberOfSubdirectorie()
  throws CompositeException {
    throw new CompositeException(
      "Invalid Operation. Not Supported");
  };

} // End of class FileSystemComponent


