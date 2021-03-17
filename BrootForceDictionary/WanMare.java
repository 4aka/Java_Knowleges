package BrootForceDictionary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WanMare {

    /**
     * WiFi password contains 8 symbols minimum
     * So we can't use passwords like 111970 or 1011970
     * 
     * If you want generate each dictionary inside different file use different path when method calls in Main.
     */

    public static void main(String[] args) throws IOException {
        String path = "D:/dictionary.txt";

        StringBuilder dataStringBuilder = new StringBuilder();
        dataStringBuilder.append(dictionary("ddMMyyyy"));
        dataStringBuilder.append(dictionary("dd.MM.yyyy"));
        dataStringBuilder.append(dictionary("dd-MM-yyyy"));

        try (FileOutputStream fout = new FileOutputStream(path, true)) {
            fout.write(dataStringBuilder.toString().getBytes());
        }
    }

    private static String dictionary(String pattern) {
        StringBuilder localBuilder = new StringBuilder();

        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(0));

        while (calendar.get(Calendar.YEAR) < 2021) {
            localBuilder.append(dateFormat.format(calendar.getTime()));
            localBuilder.append("\n");
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return localBuilder.toString();
    }
}