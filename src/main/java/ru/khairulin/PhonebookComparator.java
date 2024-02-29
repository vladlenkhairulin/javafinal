package ru.khairulin;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import java.util.HashMap;
 public class PhonebookComparator implements Comparator<String> {
    private final HashMap<String, Set<String>> phonebook;

    public PhonebookComparator(HashMap<String, Set<String>> phonebook) {
        this.phonebook = phonebook;
    }
    @Override
    public int compare(String line1, String line2) {
        int size1 = phonebook.get(line1).size();
        int size2 = phonebook.get(line2).size();
        return Integer.compare(size2, size1); // сортируем по убыванию количества номеров на человека
    }
}

