package att.db;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Stock")
public class Stock
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank
    @Column(name = "city", nullable = false)
    private String city;
}
