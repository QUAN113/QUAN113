import java.util.Date;
public abstract class Person
{
    private String name;
    private Date birth;
    private String gender;
    public Person()
    {
    }
     public Person(String name, Date birth, String gender)
    {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }
    
     public String getName()
    {
     return name;
    }

     public void setName(String name)
    {
      this.name = name;
    }

     public Date getBirth()
    {
      return birth;
    }

     public void setBirth(Date birth)
    {
      this.birth = birth;
    }

     public String getGender()
    {
      return gender;
    }

     public void setGender(String gender)
    {
      this.gender = gender;
    }
    
    
}
