package com.company;

public class Accountant extends Persona{
    private String leader;
    private String parking;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }
    public String Contadores() {
        return "Name = " + this.getName() + ", identification = " + this.getIdentification() + ", age= "
                + this.getAge() + ", leader = " +this.getLeader()+ ", parking = "+this.getParking();
    }
}
