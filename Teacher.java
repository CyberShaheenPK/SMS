
package project;


public class Teacher 
{
   private String name;
   private int Salary;
   private int id;
   private Course course;
   private Class class;
   
   
   public Teacher (int id,String name,int Salary)
   {
       this.id=id;
       this.name=name;
       this.Salary=Salary;
   }
   
   public int getId()
   {
       return id;
   }
   public String  getName()
   {
       return name;
   }
   
   public int getSalary()
   {
       return Salary;
   }
   public void setSalary(int id,String name)
   {
       this.Salary=Salary;    
   }
   public void setClass(Class c)
   {
       this.Class=Class;
   }
  
   public void addCourse(Course c)
   {
       courseLIst.addElement(c);
   }
}
