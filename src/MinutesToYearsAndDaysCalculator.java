public class MinutesToYearsAndDaysCalculator {
    //Constant Declaration
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("InValid Value");
        } else {
            long years = minutes / 525600;
            long remaining_minutes = (minutes - (years * 525600));
            long remaining_days = remaining_minutes / 1440;
            System.out.println(minutes + " min = " + years + "y and " + remaining_days + "d");
        }
    }


    public static void main(String[] args){
        printYearsAndDays(525);
    }

}
