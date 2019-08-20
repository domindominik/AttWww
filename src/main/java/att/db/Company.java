package att.db;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "company")
public class Company
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank
    @Column(name = "surname", nullable = false)
    private String surname;

    @NotBlank
    @Column(name = "type", nullable = false)
    private int type;

    @NotBlank
    @Column(name = "street", nullable = false)
    private String street;

    @NotBlank
    @Column(name = "number", nullable = false)
    private String number;

    @NotBlank
    @Column(name = "apartment", nullable = false)
    private String apartment;

    @NotBlank
    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @NotBlank
    @Column(name = "stock", nullable = false)
    private int stock;

    @NotBlank
    @Column(name = "ticker", nullable = false)
    private String ticker;

    @NotBlank
    @Column(name = "add", nullable = false)
    private int add;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getType() {
        return type;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getApartment() {
        return apartment;
    }

    public String getZipcode() {
        return zipcode;
    }

    public int getStock() {
        return stock;
    }

    public String getTicker() {
        return ticker;
    }

    public int getAdd() {
        return add;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}

