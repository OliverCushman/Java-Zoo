public class TestAnimal extends Animal
{
  public TestAnimal() {
    super("Oliver Cushman", "orange", 0);
  }
  
  @Override
  public String getName() {
    return "clownfish";
  }
  
  @Override
  public String getType() {
    return "fish";
  }
  
  @Override
  public String speak() {
      return "pop pop pop";
  }
  
  @Override
  public String getDisposition() {
      return "happy and eccentric";
  }
}
