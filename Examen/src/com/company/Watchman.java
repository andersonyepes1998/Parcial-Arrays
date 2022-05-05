package com.company;

public class Watchman extends Persona {
    private String weapon;
    private String workday;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }
    public String mostrar(){
        return "Name = "+this.getName()+ ", identification = "+this.getIdentification()+ ", age= "
                +this.getAge()+ ", weapon = "+this.getWeapon()+ ", workday= "+this.getWorkday();
    }
}
