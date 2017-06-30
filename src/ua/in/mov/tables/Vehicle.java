package ua.in.mov.tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by yura on 30.06.2017.
 */
@Entity
public class Vehicle {
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
    private Vehicle parent;

    public Vehicle getParent() {
        return parent;
    }

    public void setParent(Vehicle parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    private Collection<Vehicle> children;

    public Collection<Vehicle> getChildren() {
        return children;
    }

    public void setChildren(Collection<Vehicle> children) {
        this.children = children;
    }

    public Vehicle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  "(" + code + ") " + description ;
    }

    @OneToMany(mappedBy = "vehicle")
    private Collection<Waybill> waybills;

    public Collection<Waybill> getWaybills() {
        return waybills;
    }

    public void setWaybills(Collection<Waybill> waybills) {
        this.waybills = waybills;
    }

    @OneToOne
    private Storage storage;

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @OneToOne(optional = false)
    private Model model;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
