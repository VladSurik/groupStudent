package com.company;

import java.util.Random;

public class Birthday {
    public String createDateBirthday() {
        Random random = new Random();
        String day = Integer.toString(random.nextInt(31 - 1) + 1);
        String month = Integer.toString(random.nextInt(12 - 1) + 1);
        String year = Integer.toString(random.nextInt(2011 - 1985) + 1985);
        String birthday = day = day.length() == 1 ? "0" + day +".": day + ".";
        birthday += month = month.length() == 1 ? "0" + month + "." + year : month + "." + year;
        return birthday;
    }
}
