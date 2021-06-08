import java.util.ArrayList;


public class Portfolio{


  // Creates a new ArrayList of Project objects
  ArrayList<Project> projects = new ArrayList<Project>();


  // Adds a Project object to the projects ArrayList
  public void addProject(Project project) {
    this.projects.add(project);
  }


  // Calculates and returns the cost to buy the entire portfolio
  public double getPortfolioCost() {
    double totalCost = 0;

    for (Project project: this.projects) {
      totalCost += project.getInitialCost();
    }

    return totalCost;
  }


  // Will print all the project elevator pitches, followed by the total cost
  public void showPortfolio() {
    System.out.println(" ------- List of Portfolio Projects and Total Cost ------- ");

    for (Project project: this.projects) {
      System.out.println(project.elevatorPitch());
    }

    System.out.println("Total cost of the portfolio: $" + this.getPortfolioCost());
  }
}