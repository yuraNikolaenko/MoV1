package ua.in.mov.tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by yura on 30.06.2017.
 */
@Entity
public class Counterparty {
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
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    private Boolean marked;

    public Boolean getMarked() {
        return marked;
    }

    public void setMarked(Boolean marked) {
        this.marked = marked;
    }

    @Basic
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    private Boolean folder;

    public Boolean getFolder() {
        return folder;
    }

    public void setFolder(Boolean folder) {
        this.folder = folder;
    }

    @ManyToOne
    private Counterparty parent;

    public Counterparty getParent() {
        return parent;
    }

    public void setParent(Counterparty parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    private Collection<Counterparty> children;

    public Collection<Counterparty> getChildren() {
        return children;
    }

    public void setChildren(Collection<Counterparty> children) {
        this.children = children;
    }

    public Counterparty() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Counterparty)) return false;
        Counterparty counterparty = (Counterparty) o;
        return Objects.equals(id, counterparty.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  "(" + code + ") " + description ;
    }

    @OneToOne(mappedBy = "counterparty", optional = false)
    private Waybill_Tasks waybill_tasks;

    public Waybill_Tasks getWaybill_tasks() {
        return waybill_tasks;
    }

    public void setWaybill_tasks(Waybill_Tasks waybill_tasks) {
        this.waybill_tasks = waybill_tasks;
    }
}
