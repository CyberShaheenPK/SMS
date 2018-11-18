
package project;

import java.util.jar.Attributes.Name;


public class Class 
{
   private String className;
   private Course classCourse;
   
   public void setName(Name n)
   {
       this.className=n;
   }
   public void addCourse(Course c)
   {
       courseList.addElement(c);
   }
}
