package com.company;

public class CleaningStaff extends Persona {
    private String dayOff;

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    public String EquipoLimpieza() {
        return "Name = " + this.getName() + ", identification = " + this.getIdentification() + ", age= "
                + this.getAge() + ", dayOff = " + this.getDayOff();
    }
}
