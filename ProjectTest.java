public class ProjectTest {

  public static void main(String[] args) {

    // Create projects
    Project project1 = new Project();
    Project project2 = new Project("2nd Project");
    Project project3 = new Project("3rd Project", "3rd project description");
    Project project4 = new Project("4th Project", "4th project description", 4000.00);


    // Create portfolio
    Portfolio portfolio = new Portfolio();


    // Display all projects
    System.out.println(" ------- Display all projects ------- ");
    System.out.println(project1.elevatorPitch());
    System.out.println(project2.elevatorPitch());
    System.out.println(project3.elevatorPitch());
    System.out.println(project4.elevatorPitch());
    System.out.println();


    // Testing project setters
    project1.setName("1st Project");
    project1.setDescription("1st project description");
    project1.setInitialCost(1000.00);
    project2.setDescription("2nd project description");
    project2.setInitialCost(2000.00);
    project3.setInitialCost(3000.00);


    // Testing project getters
    System.out.println(" ------- Testing Project Getters ------- ");
    System.out.println(project1.getName());
    System.out.println(project1.getDescription());
    System.out.println(project1.getInitialCost());
    System.out.println();


    // Adding projects to portfolio
    portfolio.addProject(project1);
    portfolio.addProject(project2);
    portfolio.addProject(project3);
    portfolio.addProject(project4);


    // Testing get portfolio cost
    System.out.println(" ------- Testing Get Portfolio Cost ------- ");
    System.out.println(portfolio.getPortfolioCost());
    System.out.println();


    // Testing show all projects in portfolio and total cost
    portfolio.showPortfolio();
  }
}