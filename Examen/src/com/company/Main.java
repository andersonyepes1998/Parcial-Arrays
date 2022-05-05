package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        List<Watchman> watchmanList = new ArrayList();
        List<CleaningStaff> cleaningStaffs = new ArrayList();
        List<Accountant> accountants = new ArrayList();
        List<Admin> admins = new ArrayList();

        String i = "si";
        int num;

        while (i.equals("si") || i.equals("si") || i.equals("SI")) {
            System.out.println("Cual es el perfil que deseas escojer: 1.watchman, 2.cleaningStaff, 3.accountant, 4.admin");
            num = (Integer.parseInt(inputData.nextLine()));

            if (num == 1) {
                    Watchman watchman = new Watchman();
                    System.out.println("Ingrese name: ");
                    watchman.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificacion: ");
                    watchman.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese age: ");
                    watchman.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Ingrese weapon: ");
                    watchman.setWeapon(inputData.nextLine());
                    System.out.println("Ingrese los dias trabajados: ");
                    watchman.setWorkday(inputData.nextLine());
                    watchmanList.add(watchman);
            }else if(num == 2) {
                    CleaningStaff cleaningStaff = new CleaningStaff();
                    System.out.println("Ingrese name: ");
                    cleaningStaff.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificacion: ");
                    cleaningStaff.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese age: ");
                    cleaningStaff.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Ingrese dayOFF");
                    cleaningStaff.setDayOff(inputData.nextLine());
                    cleaningStaffs.add(cleaningStaff);
            }else if(num == 3) {
                    Accountant accountant = new Accountant();
                    System.out.println("Ingrese name: ");
                    accountant.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificacion: ");
                    accountant.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese age: ");
                    accountant.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Ingrese leader:");
                    accountant.setLeader(inputData.nextLine());
                    System.out.println("Ingrese parking:");
                    accountant.setParking(inputData.nextLine());
                    accountants.add(accountant);
            }else if(num == 4) {
                    Admin admin = new Admin();
                    System.out.println("Ingrese name: ");
                    admin.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificacion: ");
                    admin.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese age: ");
                    admin.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Ingrese leader:");
                    admin.setLeader(inputData.nextLine());
                    System.out.println("Ingrese parking:");
                    admin.setParking(inputData.nextLine());
                    admins.add(admin);
            }else {
                break;
            }


            System.out.println("Deseas ingresar otra persona de nuevo al perfil: ");
            String stop = inputData.nextLine();
            if (stop.equals("NO")||stop.equals("no")){
                break;
            }
        }

        System.out.println("CUAL ES EL PERFIL QUE DESEA CONSULTAR: 1.watchman, 2.cleaningStaff, 3.accountant, 4.admin ");
        num = (Integer.parseInt(inputData.nextLine()));

        switch (num){
            case 1:
                for (int a = 0; a < watchmanList.size(); a++) {
                    System.out.println("El perfil seria el siguiente de vigilante: "+watchmanList.get(a).mostrar());
            }
            break;

            case 2:
                for (int b = 0; b<cleaningStaffs.size(); b++){
                    System.out.println("El registro del equipo de limpieza es: "+cleaningStaffs.get(b).EquipoLimpieza());
                }
            break;

            case 3:
                for (int c = 0; c<accountants.size(); c++){
                    System.out.println("El perfil de contadores es el siguiente: "+accountants.get(c).Contadores());
                }
            break;

            case 4:
                for (int d=0; d<admins.size(); d++){
                    System.out.println("El perfil de administradors es el siguiente: "+admins.get(d).Administracion());
                }
            break;
        }

    }
}
