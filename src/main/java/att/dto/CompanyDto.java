package att.dto;

import javax.validation.constraints.NotNull;

public class CompanyDto
{
    private int id;

    @NotNull
    private String name;

    @NotNull
    private int type;

    @NotNull
    private String street;

    @NotNull
    private String number;

    @NotNull
    private String apartment;

    @NotNull
    private String zipcode;

    @NotNull
    private String stock;

    @NotNull
    private String ticker;

    @NotNull
    private int add;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getStock() {
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

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
