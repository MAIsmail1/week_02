package _4_access_modifiers_eg_public_private;

import _4_access_modifiers_eg_public_private.ServiceCode_Vehicle;

public class ClientCode {
    public static void main(String[] args) {
        ServiceCode_Vehicle serviceCodeVehicle = new ServiceCode_Vehicle();
        serviceCodeVehicle.startEngine();
        String kind = serviceCodeVehicle.kind;
        System.out.println(kind);
    }
}
