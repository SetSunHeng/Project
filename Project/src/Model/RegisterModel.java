
package Model;


public class RegisterModel {
    private int id;
    private String name, gender, course, price, shift, dob, pob;

    public RegisterModel(int id, String name, String gender, String course, String price, String shift, String dob, String pob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.price = price;
        this.shift = shift;
        this.dob = dob;
        this.pob = pob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getPrice() {
        return price;
    }

    public String getShift() {
        return shift;
    }

    public String getDob() {
        return dob;
    }

    public String getPob() {
        return pob;
    }
    
    
    
}
