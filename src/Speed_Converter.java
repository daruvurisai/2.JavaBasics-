public class Speed_Converter {
    public static long toMilesPerHour(double KilometersPerHour){
        if(KilometersPerHour<0){
            return -1;//Invalid Value
        }
        else{
            //Formulae for converting to miles per hour
          return Math.round(KilometersPerHour/1.609);

        }
    }
    public  static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("InValid Value");
        }
        else {
            long milesPerHour=toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+"Km/h= "+milesPerHour+ " mi/h");
        }
    }

}
