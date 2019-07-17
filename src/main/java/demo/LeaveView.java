package demo;

import entity.LeaveRecord;
import entity.User;
import model.Model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LeaveView {
    private LeaveRecord leaveRecord = new LeaveRecord();

    public String doSubmit() {
        Model model = new Model();
        boolean result = model.insertLeaveRecord(leaveRecord);
        if (result) {
            return "home";
        } else {
            return "leave";
        }
    }

    public LeaveRecord getLeaveRecord() {
        return leaveRecord;
    }

    public void setLeaveRecord(LeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }
}
