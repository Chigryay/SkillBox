package practice;

import net.sf.saxon.style.XSLOutput;

import java.util.*;

public class PhoneBook {
    private Map<String, String> phoneBook;
    private static final String REGEX_FOR_PHONE = "\\+?(7|8)?\\W?[(]?\\d{3}[)]?\\W?\\d{3}\\W?\\W?\\d{2}\\W?\\d{2}$";
    private static final String REGEX_FOR_NAME = "[A-Za-zА-Яа-я]+";
    private static final String INVALID_FORMAT = "Неверный формат ввода";

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (checkValidationName(name) && checkValidationPhone(phone)) {

            for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                if (pair.getValue().equals(name)) {
                    phoneBook.put(pair.getKey() + ", " + phone, pair.getValue());
                } else if (phoneBook.containsKey(phone))
                    phoneBook.put(phone, name);
            }
            phoneBook.putIfAbsent(phone, name);
        } else
            System.out.println(INVALID_FORMAT);


    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        Set<String> keys = phoneBook.keySet();
        return phoneBook.containsKey(phone) ?
                keys.contains(phone) ?
                        phoneBook.get(phone) + " - " + phone :
                        "" :
                "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        Set<String> contacts = new TreeSet<>();
        if (phoneBook.containsValue(name)) {
            for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                if (pair.getValue().equals(name)) {
                    contacts.add(name + " - " + pair.getKey());
                }
            }
            return contacts;
        } else
            return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> contacts = new TreeSet<>();
        if (!phoneBook.isEmpty()) {
            for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                contacts.add(pair.getValue() + " - " + pair.getKey());
            }
            return contacts;
        } else
            return new TreeSet<>();
    }

    private boolean checkValidationPhone(String phone) {
        return phone.matches(REGEX_FOR_PHONE);
    }

    private boolean checkValidationName(String name) {
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