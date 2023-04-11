package domain;  
 
import java.util.ArrayList;

public class Nanodegree extends Program{
   

    private int projectWeeks;    
    private ArrayList<Course> courses;
    
    /**
     * Constructs a new nanodegree
     * @param name 
     * @param discount 
     */
    public Nanodegree(String name, int projectWeeks){
        this.name=name;
        this.projectWeeks=projectWeeks;
        courses= new ArrayList<Course>();
    }


     /**
     * Add a new course
     * @param c
     */   
    public void addCourse(Course c){
        courses.add(c);
    }
       
 
    
    @Override
    public int weeks() throws IEMOISException{
        int sem = 0;
        for (Course c : courses){
            sem = c.weeks();
        }
        return sem;
    }
    
    
     /**
     * Calculates an estimate of weeks
     * For courses where the weeks cannot be known or has error, the max, min or avg  of the known courses is assumed
     * @param type (max,min,avg) 
     * @return 
     * @throws IEMOISException NANO_EMPTY, if it don't have courses. IMPOSSIBLE, if it can't be calculated
     */
    public int weeks(String type) throws IEMOISException{
        int sem = 0;
        if(type.equals("max")){
            
        
        }
        if (type.equals("min")){
        
        }
        if(type.equals("avg")){
        
        }
        return sem;
    }   
    
    

    
     /**
     * Calculates an estimate of weeks
     * For courses where the weeks cannot be known, unknown is assumed
     * @param unknown 
     * @return 
     * @throws IEMOISException NANO_EMPTY, if it don't have courses. WEEKS_ERROR, if some course has error
     */
    public int weeks(int unknown) throws IEMOISException{
        return 0;
    } 
    
    @Override
    public String data() throws IEMOISException{
        StringBuffer answer=new StringBuffer();
        answer.append(name+". Proyecto: "+ projectWeeks);
        for(Course c: courses) {
            answer.append("\n\t"+c.data());
        }
        return answer.toString();
    } 
    


    
    

}
