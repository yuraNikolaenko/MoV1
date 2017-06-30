package ua.in.mov.tables;

import ua.in.mov.tables.Counterparty;
import ua.in.mov.tables.Nomenclature;
import ua.in.mov.tables.Waybill;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by yura on 30.06.2017.
 */
@Entity
public class Waybill_Tasks {
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
    private Integer linenumber;

    public Integer getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(Integer linenumber) {
        this.linenumber = linenumber;
    }

    @Basic
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @OneToMany(mappedBy = "line")
    private Collection<Waybill> waybill;

    public Collection<Waybill> getWaybill() {
        return waybill;
    }

    public void setWaybill(Collection<Waybill> waybill) {
        this.waybill = waybill;
    }

    @OneToOne(optional = false)
    private Nomenclature nomenclature;

    public Nomenclature getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
    }

    @OneToOne(optional = false)
    private Counterparty counterparty;

    public Counterparty getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
    }
}
