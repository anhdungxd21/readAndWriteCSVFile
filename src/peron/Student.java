package peron;

public class Student {
    private String id;
    private String name;
    private String result;

    public Student() {
    }

    public Student(String id, String name, String result) {
        this.id = id;
        this.name = name;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "peron.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
