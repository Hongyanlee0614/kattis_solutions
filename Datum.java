package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Datum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        String givenDate = input[0] + "/" + input[1] + "/2009";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(givenDate, format);
        DayOfWeek day = date.getDayOfWeek();

        System.out.println(day.getDisplayName(TextStyle.FULL, Locale.UK));
    }
}
