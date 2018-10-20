
import CT417_Assignment1.Course;
import CT417_Assignment1.Module;
import CT417_Assignment1.Student;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scotty k
 */
public class StudentRegDriver {
    
    public static void main(String args[]){
        
        ArrayList<Module> ENG_modules = new ArrayList<Module>();
        ArrayList<Student> ENG_students = new ArrayList<Student>();
        ArrayList<Module> CS_modules = new ArrayList<Module>();
        ArrayList<Student> CS_Students = new ArrayList<Student>();
        
        
        Course ENG = new Course("Engineering", ENG_modules, ENG_students , null, null);
        Course CS = new Course("Computer science", CS_modules, CS_Students, null, null);
        
        
        Module softEng = new Module("software Engineering", "CT417", null, null);
        Module FYP = new Module("final year project", "CT193", null, null);
        Module syschip = new Module("System on chip 1", "ee324", null, null);
        Module telecoms = new Module("Telecommunications", "ee547", null, null);
        
        
        Student scott = new Student("Scott", 21, null, 100, null , null );
        Student fiona = new Student("Fiona", 21, null, 101, null , null );
        Student Lucy = new Student("Lucy", 21, null, 102, null , null );
        Student ewan = new Student("Ewan", 21, null, 103, null , null );
        Student sarah = new Student("Sarah", 21, null, 104, null , null );
        Student liam = new Student("Liam", 21, null, 105, null , null );
        
        
        
        //add students to courses
        ENG_students.add(scott);
        ENG_students.add(fiona);
        ENG_students.add(Lucy);
        CS_Students.add(ewan);
        CS_Students.add(sarah);
        CS_Students.add(liam);
        
        //add modules to courses
        ENG_modules.add(softEng);
        ENG_modules.add(FYP);
        CS_modules.add(syschip);
        CS_modules.add(telecoms);
        
        
        System.out.println("Course =Engineering \n");
			
        for(int i = 0; i < ENG_modules.size(); i++) {
                            
            System.out.println("  \t Module =" + ENG_modules.get(i).getModule_name());
            System.out.printf(" \t \t Students registered = ");
	
            for(int j = 0; j < ENG_students.size(); j++) {
					
                System.out.printf(""+ ENG_students.get(j).getUsername() + " + ");
					
                }
             System.out.println("");
            }
        
        
        System.out.println("\n Course = Computer science  \n");
        
        for(int k = 0; k < CS_modules.size(); k++) {
                            
            System.out.println(" \t Module =" + CS_modules.get(k).getModule_name());
            System.out.printf(" \t \t Students registered = ");
	
            for(int l = 0; l < CS_Students.size(); l++) {
					
                System.out.printf(""+ CS_Students.get(l).getUsername() + " + ");
					
                }
            System.out.println("");
            }
    }
}
