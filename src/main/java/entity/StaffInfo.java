package entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class StaffInfo implements Serializable {
    private Integer id;
    private String staffName;
    private Integer staffAge;
    private Integer staffSex;
    private String phone;
    private String entryTime;
    private Integer departmentId;
    private Integer jobId;
    private Integer isTrain;
    private Integer subjectId;
    private Integer staffType;
    private String passWord;

    private List<Department> departments;
//    private List<JobTitle> jobs;
//    private List<Subject> subject;
}
