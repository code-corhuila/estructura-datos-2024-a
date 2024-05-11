package Entity;

public class Student {
    private String Code;
    private String Name;
    private String Lastname;
    private String Phone;
    private Boolean Stade;

    public Student (String code,String name,String lastname,String phone){

    }
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }


    public Boolean getStade() {
        return Stade;
    }

    public void setStade(Boolean stade) {
        Stade = stade;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
