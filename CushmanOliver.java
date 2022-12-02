public class CushmanOliver extends Animal
{
  public CushmanOliver() {
    super("Oliver Cushman", "gray", 0);
  }
  
  @Override
  public String getName() {
    return "megalodon";
  }
  
  @Override
  public String getType() {
    return "shark";
  }
  
  @Override
  public String speak() {
      return "nothing";
  }
  
  @Override
  public String getDisposition() {
      return "mean and hungry";
  }
}
