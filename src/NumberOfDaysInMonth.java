public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        boolean leapYear;
        if (year < 1 || year > 9999) {
            leapYear = false;
            return leapYear;
        } if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            }else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }
        return leapYear;
    }

    public static int getDaysInMonth (int month, int year) {
        int daysOfMonth;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
                    daysOfMonth = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    daysOfMonth = 30;
                    break;

                case 2:
                    if (isLeapYear(year) == true) {
                        daysOfMonth = 29;
                    } else {
                        daysOfMonth = 28;
                    }
                    break;

                default:
                    daysOfMonth = -1;
                    break;
            }
            return daysOfMonth;
        }
    }
}
