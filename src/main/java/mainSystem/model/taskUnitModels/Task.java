package mainSystem.model.taskUnitModels;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "task",schema = "main")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_list")
    private int id_list;

    @Column(name = "assignedgroupid")
    private int assignedgroupid;

    @Column(name = "assigneduserid")
    private int assigneduserid;

    @Column(name = "isdone")
    private boolean isDone;

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

    public int getId_list() {
        return id_list;
    }

    public void setId_list(int id_list) {
        this.id_list = id_list;
    }

    public int getAssignedgroupid() {
        return assignedgroupid;
    }

    public void setAssignedgroupid(int assignedgroupid) {
        this.assignedgroupid = assignedgroupid;
    }

    public int getAssigneduserid() {
        return assigneduserid;
    }

    public void setAssigneduserid(int assigneduserid) {
        this.assigneduserid = assigneduserid;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    /*private String name;
    private int priority;
    private int effort;
    private String[] dependencyList;
    private boolean isDone;
    private Date timeStamp;
    private String label;
    private String userInfo;
*/

}
