package ua.in.mov.tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by yura on 30.06.2017.
 */
@Entity
public class Nomenclature {
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
    private Nomenclature parent;

    public Nomenclature getParent() {
        return parent;
    }

    public void setParent(Nomenclature parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    private Collection<Nomenclature> children;

    public Collection<Nomenclature> getChildren() {
        return children;
    }

    public void setChildren(Collection<Nomenclature> children) {
        this.children = children;
    }

    public Nomenclature() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nomenclature)) return false;
        Nomenclature nomenclature = (Nomenclature) o;
        return Objects.equals(id, nomenclature.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  "(" + code + ") " + description ;
    }

    @OneToOne(mappedBy = "nomenclature", optional = false)
    private Waybill_Tasks waybill_tasks;

    public Waybill_Tasks getWaybill_tasks() {
        return waybill_tasks;
    }

    public void setWaybill_tasks(Waybill_Tasks waybill_tasks) {
        this.waybill_tasks = waybill_tasks;
    }
}
