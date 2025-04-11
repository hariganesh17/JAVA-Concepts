package OopConcepts;

import java.util.ArrayList;
import java.util.List;

//IMMUTABLE CLASS

final class Immutable {
        private final String vehicleName;
        private final List<Object> vehicleList;

        Immutable(String vehicleName, List<Object> vehicleList){
                this.vehicleName = vehicleName;
                this.vehicleList = vehicleList;
        }

        public String getVehicleName(){
                return vehicleName;
        }
        public List<Object> getVehicleList(){
                return new ArrayList<>(vehicleList);
                //Creates a copy to keep the original list unchanged.
        }

        public static void main (String[] args){
                List<Object> vehicleList = new ArrayList<>();
                vehicleList.add("Bus");
                vehicleList.add("Car");

                Immutable obj = new Immutable("XYZ",vehicleList);
                obj.getVehicleList().add("Bike");
                System.out.println( obj.getVehicleList());      //Output - [Bus,car]
                        //The original list remains unchanged despite adding 'Bike'.
        }
}