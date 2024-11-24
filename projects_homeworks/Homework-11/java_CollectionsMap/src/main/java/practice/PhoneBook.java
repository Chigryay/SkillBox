package practice;

import net.sf.saxon.style.XSLOutput;

import java.util.*;

public class PhoneBook {
    private Map<String, String> phoneBook;
    public static final String REGEX_FOR_PHONE = "\\+?(7|8)?\\W?[(]?\\d{3}[)]?\\W?\\d{3}\\W?\\W?\\d{2}\\W?\\d{2}$";
    public static final String REGEX_FOR_NAME = "[A-Za-zА-Яа-я]+";
    private static final String INVALID_FORMAT = "Неверный формат ввода";

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента

        if (checkValidationName(name) && checkValidationPhone(phone)) {
            if (!phoneBook.isEmpty()) {
                for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                    if (phone.equals(pair.getValue())) {
                        phoneBook.remove(pair.getKey());
                        phoneBook.put(name, phone);
                    }
                    if (name.equals(pair.getKey())) {
                        phoneBook.replace(pair.getKey(), pair.getValue() + ", " + phone);
                    } else
                        phoneBook.put(name, phone);
                }
            } else
                phoneBook.putIfAbsent(name, phone);



        } else
            System.out.println(INVALID_FORMAT);
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
            if (phone.equals(pair.getValue())) {
                builder.append(pair.getKey())
                        .append(" - ")
                        .append(phone);
            }
        }
        return builder.toString();
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        Set<String> contact = new TreeSet<>();

        for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
            if (name.equals(pair.getKey())) {
                contact.add(name + " - " + pair.getValue());
            }
        }
        return contact;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> contacts = new TreeSet<>();
        if (!phoneBook.isEmpty()) {
            for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                contacts.add(pair.getKey() + " - " + pair.getValue());
            }
            return contacts;
        } else
            return new TreeSet<>();
    }

    public static boolean checkValidationPhone(String phone) {
        return phone.matches(REGEX_FOR_PHONE);
    }

    public static boolean checkValidationName(String name) {
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