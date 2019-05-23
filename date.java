
  public static String findDay(int month, int day, int year) {
        
        String[] days={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
            Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
    String s=days[cal.get(Calendar.DAY_OF_WEEK)-1];
        
        return (s);

    }

}

