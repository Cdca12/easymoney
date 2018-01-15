package com.easymoney.entities;

import java.util.Date;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class MultaPK{

    private int prestamo;
    private Date fecha;

    public MultaPK() {
    }

    public MultaPK(int prestamo, Date fecha) {
        this.prestamo = prestamo;
        this.fecha = fecha;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}