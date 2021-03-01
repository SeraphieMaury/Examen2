package mooc;

import java.util.*;

public class Platform {
    
    private final ArrayList<Course> listesdescours;
    private Set<Person> students;
    private Set<Course> courses;
    private final ArrayList<Person> etudiantsinscrits;
    private String studentName;
    private String courseName;
    private int marks;
    public String getName() { return studentName;  }
    public String getCourse() { return courseName;  }
    public int getMark() { return marks; }
    
    
    @Override
    public String toString() { return "L'étudiant " +getName()+ " est inscrit au cours de " +getCourse()+ " et a eu la note de " +getMark(); }
        
        
        public Platform() {
            listesdescours=new ArrayList<>();
            etudiantsinscrits=new ArrayList<>();
	}

	public void addCourse(Course c) {
        
        listesdescours.add(c);
	}

	/**
	 * @return les étudiants inscrits à l'université
	 */
	public Set<Person> students() {
        
	return students;
        }

	/**
	 * @return les cours dispensés par l'université
	 */
	public Set<Course> courses() {
	
	return courses;
        }

	/**
	 * Inscrire un étudiant à l'université
	 * @param s  l'étudiant à inscrire (non null)
	 */
	public void registerStudent(Person s) {
	
	if (null == s)
            throw new IllegalArgumentException("name is null");
        etudiantsinscrits.add(s);
        
        }

	/**
	 * Inscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 */
	public void enroll(Person s, Course c) throws Exception {
	
        studentName = "" + s;
        courseName = "" + c;
       
        }
        
        /**
	 * Désinscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws Exception si l'étudiant a déjà une note àce cours
	 */
	public void withdraw(Person s, Course c) throws Exception {
        
//	if (null == marks)
//            throw new IllegalArgumentException("l'étudiant a déjà une note à ce cours");
        }

	/**
	 * Donner une note à un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @param  mark la note
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université,
	 * ou si l'étudiant a déjà une note pour ce cours
	 */
	public void setMark(Person s, Course c, int mark) throws Exception {
	
            this.marks = mark;
	}

	/**
	 * Connaitre la note d'un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @return la note de l'étudiant pour le cours
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 * ou si l'étudiant n'a pas encore de note à ce cours
	 */
	public int getMark(Person s, Course c) throws Exception {
            
	
	return marks;
        
        }

	/**
	 * @param c le cours considéré
	 * @return les étudiants inscrits à ce cours
	 * @throws Exception si le cours n'est pas dispensé par l'université
	 */
	public Set<Person> studentsForCourse(Course c) throws Exception {
	
            
        return students;
        }

	/**
	 * @param s l'étudiant considéré
	 * @return les cours auxquels un étudiant est incrit
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 */
	public Set<Course> coursesForStudent(Person s) throws Exception {
	
	return courses;
        }

	/**
	 * @return les cours auxquels aucun étudiant n'est incrit
	 */
	public Set<Course> emptyCourses() {
	return 
	}

}
