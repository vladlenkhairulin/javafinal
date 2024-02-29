package ru.khairulin;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashSet;

public class Phonebook {
    public static void main(String[] args) {
    HashMap<String, Set<String>> phoneBook = new HashMap<>();
    addNewContact(phoneBook, "name1", "354");
    addNewContact(phoneBook, "name2", "222");
    addNewContact(phoneBook, "name2", "555");
    addNewContact(phoneBook, "name3", "111");
    addNewContact(phoneBook, "name1", "123");
    addNewContact(phoneBook, "name1", "177");
        TreeMap<String, Set<String>> sortedBook;
        PhonebookComparator comparator = new PhonebookComparator(phoneBook);
        sortedBook = new TreeMap<>(comparator);
        sortedBook.putAll(phoneBook);

        for (Map.Entry<String, Set<String>> entry : sortedBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
}
    private static void addNewContact(HashMap<String, Set<String>> phonebook, String name, String phoneNumber) {
        Set<String> numbers = phonebook.get(name);
        if (numbers == null) {
            numbers = new HashSet<>();
            phonebook.put(name, numbers);
        }
        numbers.add(phoneNumber);
    }
    }

