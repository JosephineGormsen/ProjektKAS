package model;

import java.util.ArrayList;

public class HotelBooking {

    private int nummer;
    private model.EnumVærelser.Værelser værelseType;
    private model.Hotel hotel;
    private model.Registration registration;
    private ArrayList<model.Tillæg> tillæg = new ArrayList<>();


    public HotelBooking(int nummer, int pris, model.EnumVærelser.Værelser værelseType, model.Hotel hotel) {
        this.nummer = nummer;
        this.værelseType = værelseType;
        this.hotel = hotel;
    }
    public int getNummer() {
        return nummer;
    }

    public model.EnumVærelser.Værelser getVærelseType() {
        return værelseType;
    }

    public model.Hotel getHotel() {
        return hotel;
    }

    public model.Registration getRegistration() {
        return this.registration;
    }

    public void setRegistration(model.Registration registration) {
        this.registration = registration;
    }

    /**
     * Udrigner prisen af rummet for denne booking.
     */
    public double getVærelsesPris() {
        double værelsesPris = 0;
        if (værelseType == model.EnumVærelser.Værelser.SINGLE) {
            værelsesPris = hotel.getSinglePris();
        } else if (værelseType == model.EnumVærelser.Værelser.DOUBLE) {
            værelsesPris = hotel.getDoublePris();
        }
        return værelsesPris;
    }

    /**
     * Udregner prisen af de tillæg der tilhænger denne booking.
     */
    public double calculateTillægsPris() {
        double tillægPris = 0.0;
        for (model.Tillæg tillæg : this.tillæg) {
            tillægPris += tillæg.getPris();
        }
        return tillægPris;
    }

    public ArrayList<model.Tillæg> getTillæg() {
        return tillæg;
    }

    public void addTillæg(model.Tillæg tillæg) {
        this.tillæg.add(tillæg);
    }
    public void removeTillæg(model.Tillæg tillæg){
        this.tillæg.remove(tillæg);
    }
    // Udregn tillægsprisen for værelset

}
