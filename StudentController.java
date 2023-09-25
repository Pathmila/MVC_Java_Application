// class which represent the controller  
public class StudentController {  
  
    // declaring the variables model and view  
    private Student model;  
    private StudentView view; 

    // constructor to initialize  
    public StudentController(Student model, StudentView view) {  
        this.model = model;  
        this.view = view;  
    }   

    // getter and setter methods   
    public void setStudentName(String name){  
        model.setName(name);        
    }  
   
    public String getStudentName(){  
        return model.getName();         
    }

    public void setStudentId(String id){  
        model.setId(id);        
    }  
   
    public String getStudentId(){  
        return model.getId();         
    }

    public void setStudentAge(int age){  
        model.setAge(age);        
    }  
   
    public int getStudentAge(){  
        return model.getAge();         
    }

    // method to update view   
    public void printView() {                  
        view.printStudentDetails(model.getName(), model.getId(), model.getAge());  
    }    

}  
