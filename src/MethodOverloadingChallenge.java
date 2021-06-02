//This Program Converts from feet and inches to centimeters
public class MethodOverloadingChallenge {
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
      if((feet<0)||(inches<0)||(inches>12)){
          System.out.println("Invalid Feet or Inches");
            return -1;
      }
      double centimeters = feet*30.48;
      centimeters+=inches*2.54;
      System.out.println(feet + "Feet, "+inches+" inches = "+centimeters+" Cm");
      return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches<0){
            return -1;

        }
        double feet  = (int) inches/12;
        double remainingInches = (int) inches %12;
        System.out.println(inches+" Inches is equal to " +feet+ " feet and "+remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

    }
    public static void main(String[] args){
       double centimeters = calcFeetAndInchesToCentimeters(5,7);
       System.out.println(centimeters);
       calcFeetAndInchesToCentimeters(4);
    }
}
