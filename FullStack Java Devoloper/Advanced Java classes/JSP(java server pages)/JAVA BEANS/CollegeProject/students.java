//program to demonstrate java bean program

public class students implements java.io.Serializable
{
    private String name;
    private String classname;
    private int rno;
    private String contact;

    public students()
    {

    }


    //getter and setter of name
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    //getter and setter of classname
    public String getClassname() 
    {
        return classname;
    }
    public void setClassname(String classname)
     {
        this.classname = classname;
    }
    
    //getter and setter of rno
    public int getRno()
     {
        return rno;
    }
    public void setRno(int rno) 
    {
        this.rno = rno;
    }
    
    //getter and setter of conatct
    public String getContact() 
    {
        return contact;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }



}