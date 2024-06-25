package model;

import java.util.ArrayList;

public class Ledsager extends model.Person {
    private final ArrayList<model.Udflugt> udflugter = new ArrayList<>();
    private model.Deltager deltager;
    public ArrayList<model.Udflugt> getUdflugter(){
        return new ArrayList<>(udflugter);
    }

    public Ledsager(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addUdflugt(model.Udflugt udflugt){
        udflugter.add(udflugt);
    }

    public void removeUdflugt(model.Udflugt udflugt){
        udflugter.remove(udflugt);
    }

    /**
     * Udregner den samlede pris af de udflugter som ledsageren deltager til.
     */
    public double calculateUdflugtsPris(){
        double sum = 0.0;
        for (model.Udflugt udflugt : this.udflugter){
            sum += udflugt.getPris();
        }
        return sum;
    }
}
