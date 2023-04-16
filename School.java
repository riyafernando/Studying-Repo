/* New class to hold a variety of methods.
*/
public class School {
  // instance variable declaration
  private static int numSchools = 0;
  private String schoolName;
  private int numStudents;
  public final int MAX_STUDENTS = 50000;
  public static int totalStudents;

  private int numBranches;

  // default declaration / also called no-arguement declaration
  public School(){
    numSchools ++;
  }  

  // object declaration w/ parameters
  public School(int schoolStudents, String name){
    numStudents = schoolStudents;
    schoolName = name;
    numSchools ++;
    totalStudents += schoolStudents;
  }

  // overloading object declaration w/ parameters
  public School(int schoolStudents, int branchStudents, String name, int branches){
    numStudents += branchStudents;
    schoolName = name;
    numSchools += branches;
    totalStudents += branchStudents;
    numBranches = branches;
  }

  // mutators
  public void setName(String name){
    schoolName = name;
  }

  public void setNumStudents(int schoolStudents){
    if (schoolStudents < 0){
      System.out.print(schoolStudents + " is not a valid number of students. \nPlease enter a valid number of students.");
    }
    else if (schoolStudents < MAX_STUDENTS){
      numStudents = schoolStudents;
    }
    else{
      System.out.print("The max number of students is " + MAX_STUDENTS + ". \nPlease enter a valid number of students.");
    }
    
  }

  // accessors
  public String getName(){
    return schoolName;
  }

  public int getNumStudents(){
    return numStudents;
  }

  public int getNumSchools(){
    return numSchools;
  }

  // static methods
  public static String compareStudents(School thisSchool){
    int numberStudents = thisSchool.getNumStudents();
    double percentage = (numberStudents/(double) totalStudents) * 100.0;
    
    return (thisSchool.getName() + " has " + thisSchool.getNumStudents() + " students and contains around " + (int) percentage + "% of the total student population in the schools entered.");
  }
}
