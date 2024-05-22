package Baitap.DSA_Stack_Queue.Demerging_Queue;

public class Personnel {

    private String name;
    private String gender;
    private String birth;

    public Personnel() {}

    public Personnel(String name, String gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
