package ua.in.mov.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yura on 30.06.2017.
 */
@Entity
public class Waybill {
    @GeneratedValue
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    private boolean marked;

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @Basic
    private boolean posted;

    public boolean isPosted() {
        return posted;
    }

    public void setPosted(boolean posted) {
        this.posted = posted;
    }

    @ManyToOne(optional = false)
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @ManyToOne(optional = false)
    private Waybill_Tasks line;

    public Waybill_Tasks getLine() {
        return line;
    }

    public void setLine(Waybill_Tasks line) {
        this.line = line;
    }
}
