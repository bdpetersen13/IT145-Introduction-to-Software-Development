/*
Define a constructor as indicated. Sample output for below program:
Year: 0, VIN: -1
Year: 2009, VIN: 444555666
*/

// ===== Code from file CarRecord.java =====
public class CarRecord {
   private int yearMade;
   private int vehicleIdNum;

   public void setYearMade(int originalYear) {
      yearMade = originalYear;
   }

   public void setVehicleIdNum(int vehIdNum) {
      vehicleIdNum = vehIdNum;
   }

   public void print() {
      System.out.println("Year: " + yearMade + ", VIN: " + vehicleIdNum);
   }

   public CarRecord() {
      yearMade = 0;
      vehicleIdNum = -1;
   }

}
// ===== end =====

// ===== Code from file CallCarRecord.java =====
public class CallCarRecord {
   public static void main (String [] args) {
      CarRecord familyCar = new CarRecord();

      familyCar.print();
      familyCar.setYearMade(2009);
      familyCar.setVehicleIdNum(444555666);
      familyCar.print();

   }
}
// ===== end =====
