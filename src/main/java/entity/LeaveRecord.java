package entity;

public class LeaveRecord {
    private int id;
    private String name;
    private String reason;

    public LeaveRecord() {
    }

    public LeaveRecord(String name, String reason) {
        this.name = name;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
