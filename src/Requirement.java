import java.io.Serializable;

public class Requirement implements Serializable
{
  private String id, type, description, priority, status, projectId;
  private double totalHours, timeEstimate;
  private Date deadline;
  private Employee teamMember;
  private TaskList tasks;
  private String date;

  // Constructors
  /*
  public Requirement(String projectId, String id, String description, Date deadline)
  {
    this.projectId = projectId;
    this.id = id;
    this.description = description;
    this.deadline = deadline;
    tasks = new TaskList();
  }

   */

  // TEST CONSTRUCTORS
  public Requirement(String id, String status, String description, Date deadline)
  {
    this.id = id;
    this.status = status;
    this.description = description;
    this.deadline = deadline;
    tasks = new TaskList();
  }

  public Requirement(String id, String status, String description)
  {
    this.id = id;
    this.status = status;
    this.description = description;
    tasks = new TaskList();
  }


  public Requirement()
  {
  }


  // Getters
  public String getId()
  {
    return id;
  }

  public String getDescription()
  {
    return description;
  }

  public String getStatus()
  {
    return status;
  }

  public TaskList getTasks()
  {
    return tasks;
  }

  public Date getDeadline()
  {
    return deadline;
  }

  // Setters
  public void setDeadline(Date deadline)
  {
    this.deadline = deadline;
  }
  public void setTasks(TaskList tasks)
  {
    this.tasks = tasks;
  }

  // toString
  public String toString()
  {
    String str = "-----------------------";
    return str + "\nRequirement id: " + id + "\nPriority: " + priority
        + "\nStatus: " + status + "\nType: " + type +"\nDescription: "
        + description + "\nDeadline: " + deadline
        + "\nTeam Member: " + teamMember + "\nTotal Hours: " + totalHours
        + "\nTime Estimate: " + timeEstimate + "\nProject id: " + projectId + "\n";
  }
}
