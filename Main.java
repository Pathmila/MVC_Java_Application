// main class  
public class Main {  
    public static void main(String[] args) {  
        Student model = retriveStudentData();  
        
        // creating a view to write Employee details on console  
        StudentView view = new StudentView();  
   
        StudentController controller = new StudentController(model, view);  

        controller.printView();
    }

    private static Student retriveStudentData(){  
          Student Student = new Student();  
          Student.setName("Nisini");  
          Student.setId("26286");  
          Student.setAge(24);  
          return Student;  
    }
}