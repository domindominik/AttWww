package att.db;

import javax.persistence.*;

@Entity
@Table(name = "user_type")
public class User_Type
{
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementator")
    private int id;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
