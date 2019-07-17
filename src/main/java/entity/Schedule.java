package entity;

public class Schedule {
    private int id;
    private String name;
    private String work;
    private String date;

    public Schedule() {
    }

    public Schedule(String name, String work, String date) {
        this.name = name;
        this.work = work;
        this.date = date;
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

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
