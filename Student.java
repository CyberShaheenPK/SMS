/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.ArrayList;
/**
 *
 * @author mma
 */
public class Student
{
private int feesTotal;
private String name;
private int id;
private int grade;
private int feesPaid;
private Course courseEnrolled;
private Class classC;
ArrayList arrayStudent = new ArrayList(100);
public Student(int id,String name,int grade)
{
   this.id=id;
   this.name=name;
   this.grade=grade;
}
public void setGrade(int grade)
{
this.grade=grade;
}
public void updateFeesPaid()
{
feesPaid+=feesPaid;
} 
public double getRemainingFees()
{
return remainingFees;
}
public void addCourse(Course C)
{
arrayStudent.add(C);
}
public void setClass(Class C)
{
this.C=C;
}
}
