// class that represents model 
public class Student{
    // declaring the variables  
    private String StudentName;  
    private String StudentId;  
    private int StudentAge;  

    // defining getter and setter methods  
    public String getName() {  
        return StudentName;  
    }  

    public void setName(String name) {  
        this.StudentName = name;  
    }  
    
    public String getId() {  
        return StudentId;  
    }  

    public void setId(String id) {  
        this.StudentId = id;  
    }  

    public int getAge() {  
        return StudentAge;  
    }  

    public void setAge(int age) {  
        this.StudentAge = age;  
    }  
}