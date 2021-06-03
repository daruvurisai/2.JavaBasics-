public class SecondsAndMinutes {
//Constant Declaration Should be outside a method.
    private static final String Invalid_Value_Message = "Invalid value";

    public static String getDurationString(int minutes , int seconds){
      if((minutes>=0)&&(seconds>=0&&seconds<=59)){
          int hours = minutes/60;
          int remainingMinutes = minutes%60;
          String hoursString = hours+"h";
          if(hours<10){
              hoursString="0"+hoursString;
          }

          String minuteString = remainingMinutes+"m";
          if(minutes<10){
              minuteString="0"+minuteString;
          }

          String secondString = seconds+"s";
          if(seconds<10){
              secondString="0"+secondString;
          }
          else{
              return hoursString+" "+minuteString+" "+secondString+"";
          }
 }

          return Invalid_Value_Message;

    }

    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minute_value = seconds/60;
            int remainingSeconds= seconds%60;
            return getDurationString(minute_value,remainingSeconds);

        }
        else {
          return Invalid_Value_Message;
        }
    }
    public static void main(String[] args){
       System.out.println(getDurationString(861,12));
        System.out.println(getDurationString(-861,12));
       System.out.println(getDurationString(345));
        System.out.println(getDurationString(-3945));
    }


}
