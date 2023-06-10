package OOPS.Encapsulation;

class Student 
{ 
 private String name; 
 private int socMarks; 
 private int frenMarks; 
 private int engMarks; 

public void setName(String name)
{ 
 this.name = name; 
}
public void setSocMarks(int socMarks)
{ 
 this.socMarks = socMarks; 
} 
public void setFrenMarks(int frenMarks)
{ 
 this.frenMarks = frenMarks; 
} 
public void setEngMarks(int engMarks)
{ 
 this.engMarks = engMarks; 
} 
void marksRead() 
{ 
    System.out.println("Student's Name: " +name); 
    System.out.println("Marks in Social: " +socMarks); 
    System.out.println("Marks in French: " +frenMarks); 
    System.out.println("Marks in English: " +engMarks); 
    int Totalmarks = socMarks + frenMarks + engMarks; 
    float percentage = (Totalmarks * 100)/300; 
    System.out.println("Percentage of PCB: " +percentage); 
 } 
}
class Encapsulation3
{ 
public static void main(String[] args) 
{ 
 Student st = new Student(); 
 st.setName("Krithick"); 
 st.setSocMarks(85); 
 st.setFrenMarks(75); 
 st.setEngMarks(90); 
 st.marksRead();
}
}