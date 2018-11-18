
package project;


public class School 
{
   private Teacher teacher;
   private Student student;
   private int totalMoneyEarned;
   private int totalMoneySpent;
   private Class classList;
   
   public School(Teacher t,Student s)
   {
       this.teacher=t;
       this.student=s;
   }
   
   public Teacher getTeacher()
   {
       return teacher;     
   }
   
   public Student getStudent()
   {
       return student;
   }
   
   public void addTeacher(Teacher t)
   {
       teacherList.addElement(t);
   }
   
   public void addStudent(Student s)
   {
       studentList.addElement(s);
   }
   
   public int getTotalMoneyEarned()
   {
       return totalMoneyEarned;
   }
   
   public int getTotalMoneySpent()
   {
       return totalMoneySpent;
   }
   
   public void setTotalMoneyEarned( int tME )
   {
       this.totalMoneyEarned=tME;
   }
   
    
   public void setTotalMoneySpent( int tMS )
   {
       this.totalMoneySpent=tMS;
   }
   
   public void addClass(Class c)
   {
       classList.addElement(c);
   }
   
   public void removeClass(Class c)
   {
       classList.remove();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
