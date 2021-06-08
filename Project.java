public class Project {
  private String name;
  private String description;
  private Double initialCost;


  // Constructors
  public Project() {
    this.name = "";
    this.description = "";
    this.initialCost = 0.00;
  }


  public Project(String projName) {
    this.name = projName;
    this.description = "";
    this.initialCost = 0.00;
  }


  public Project(String projName, String projDesc) {
    this.name = projName;
    this.description = projDesc;
    this.initialCost = 0.00;
  }


  public Project(String projName, String projDesc, Double projCost) {
    this.name = projName;
    this.description = projDesc;
    this.initialCost = projCost;
  }


  // Setters
  public void setName(String newName) {
    this.name = newName;
  }
  public void setDescription(String newDesc) {
    this.description = newDesc;
  }
  public void setInitialCost(Double newCost) {
    this.initialCost = newCost;
  }


  // Getters
  public String getName() {
    return (name);
  }
  public String getDescription() {
    return (description);
  }
  public Double getInitialCost() {
    return (initialCost);
  }


  public String elevatorPitch() {
    return (this.getName() + " ($" + Double.toString(getInitialCost()) + "): " + this.getDescription());
  }
}