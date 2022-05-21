import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
public class Student extends Person implements Comparator<Student>, Serializable
{
    private String studentID;
    private String major;
    private Date enrolledDate;

    public Student()
    {
     super();
    }

    public Student(String studentID, String major, Date enrolledDate, String name, Date birth, String gender)
    {
        super(name, birth, gender);
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public String getStudentID()
    {
     return studentID;
    }

     public void setStudentID(String studentID)
    {
     this.studentID = studentID;
    }
    
     public String getMajor()
    {
     return major;
    }
     public void setMajor(String major)
    {
        this.major = major;
    }

     public Date getEnrolledDate()
    {
        return enrolledDate;
    }

     public void setEnrolledDate(Date enrolledDate)
    {
        this.enrolledDate = enrolledDate;
    }

    
    @Override
     public int compare(Student o1, Student o2)
    {
      throw new UnsupportedOperationException("Not supported yet.");
    }

     void getBirth(java.sql.Date date)
    {
      throw new UnsupportedOperationException("Not supported yet.");
    }
}
