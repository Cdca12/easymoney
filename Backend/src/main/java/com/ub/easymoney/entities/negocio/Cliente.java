/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.easymoney.entities.negocio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ub.easymoney.entities.commons.commons.IEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable, IEntity<Integer> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 2147483647)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "apodo")
    private String apodo;
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<Prestamo> prestamoList;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "dias_sin_multa")
    private String diasSinMulta;

    public Cliente() {
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @JsonIgnore
    public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }

    public void setPrestamoList(List<Prestamo> prestamoList) {
        this.prestamoList = prestamoList;
    }

    public String getDiasSinMulta() {
        return diasSinMulta;
    }

    public void setDiasSinMulta(String diasSinMulta) {
        this.diasSinMulta = diasSinMulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ub.easymoney.entities.negocio.Cliente[ id=" + id + " ]";
    }

    @Override
    public Integer obtenerIdentificador() {
        return id;
    }

}
