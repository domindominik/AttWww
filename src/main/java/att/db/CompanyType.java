package att.db;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "company_type")
public class CompanyType
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;
}
