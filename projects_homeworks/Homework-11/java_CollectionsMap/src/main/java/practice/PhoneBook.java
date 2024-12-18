package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

    private static final String REGEX_FOR_PHONE = "\\+?(7|8)?\\W?[(]?\\d{3}[)]?\\W?\\d{3}\\W?\\W?\\d{2}\\W?\\d{2}$";
    private static final String REGEX_FOR_NAME = "[A-Za-zА-Яа-я]+";
    private static final String INVALID_FORMAT = "Неверный формат ввода";

    private final Map<String, String> phoneBook;

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (isMatchesPhone(phone) && isMatchesName(name)) {
            if (!phoneBook.isEmpty()) {
                for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                    if (pair.getValue().equals(phone)) {
                        phoneBook.remove(name);
                        phoneBook.put(name, phone);
                        System.out.printf("added %s - %s\n", name, phone);
                    }
                }
            } else {
                phoneBook.put(name, phone);
                System.out.printf("added %s - %s\n", name, phone);
            }

        }

    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    private boolean isMatchesPhone(String phone) {
        return phone.matches(REGEX_FOR_PHONE);
    }

    private boolean isMatchesName(String name) {
        return name.matches(REGEX_FOR_NAME);
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}