
package ru.mirea.task4.Seasons;
import java.util.Locale;
public class TestSeasons {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            printInfo(season);
        }
        String a;
        a="Моё любимое время года зима";
        System.out.print("\nЯ люблю лето: ");
        printInfo(Seasons.valueOf("SUMMER"));
        System.out.print("\n "+a+ "\n ");
        printInfo(Seasons.valueOf("WINTER"));
    }
    public static void printInfo(Seasons season) {
        System.out.printf(Locale.ROOT, "%s %s, ", season.name(), season);
        season.getDescription();
    }
}





