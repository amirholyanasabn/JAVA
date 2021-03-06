package entities;

public class Student {
    private int id;
    private String ssn;
    private String name;
    private String family;
    private String major;

    public Student() {
    }

    public Student(int id, String ssn, String name, String family, String major) {
        this.id = id;
        this.ssn = ssn;
        this.name = name;
        this.family = family;
        this.major = major;
    }

    public Student(String ssn, String name, String family, String major) {
        this.ssn = ssn;
        this.name = name;
        this.family = family;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
