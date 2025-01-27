package StudentInfo;

public class Students {
    private int id;
    private String name;
    private int sClass;
    private String address;

    public Students() {
    }

    public Students(int id, String name, int sClass, String address) {
        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.address = address;
    }

    public Students(String name, int sClass, String address) {
        this.name = name;
        this.sClass = sClass;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
