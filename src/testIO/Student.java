package testIO;

import java.io.Serializable;

public class Student implements Serializable{
	
  private String name;
  private int age;
  
  public Student(String name, int age){
	  super();
	  this.name = name;
	  this.age = age;
	  
  }
  
  public String toString(){
	  return "Student [name =" + name +".age="+age+"]";
  }
}
