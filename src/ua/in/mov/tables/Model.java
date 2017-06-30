package ua.in.mov.tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by yura on 30.06.2017.
 */
@Entity
public class Model {
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
    private Model parent;

    public Model getParent() {
        return parent;
    }

    public void setParent(Model parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    private Collection<Model> children;

    public Collection<Model> getChildren() {
        return children;
    }

    public void setChildren(Collection<Model> children) {
        this.children = children;
    }

    public Model() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model)) return false;
        Model vehicle = (Model) o;
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

    @OneToOne(mappedBy = "model", optional = false)
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
