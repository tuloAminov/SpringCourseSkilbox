import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    private TreeMap<String, Set<String>> my_contacts = new TreeMap<>();

    public PhoneBook(TreeMap<String, Set<String>> my_contacts) {
        this.my_contacts = my_contacts;
    }

    public void addContact(String phone, String name) {
        /*if (my_contacts.containsValue(phone) || my_contacts.containsKey(name))
            my_contacts.put(name, phone);*/
    }

    public String getNameByPhone(String phone) {
/*        if (my_contacts.containsKey(phone))
            return my_contacts.get(phone);*/
        return "";
    }

    public Set<String> getPhonesByName(String name) {
        //TODO по имени вернуть список номеров
        return null;
    }

    public StringBuilder getNumbersToString(Set<String> numbers) {
        //TODO вернуть номера в формате строки <номер>, <номер>.
        return null;
    }

    public Set<String> getAllContacts() {
        //TODO вернуть все контакты в формате <имя> — <номер>, <номер> и тд
        return null;
    }

    public boolean checkContacts(String name) {
        //TODO проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        return false;
    }

    public boolean isCorrect(String name, String phone){
        //TODO проверьте корректность номера
        return true;
    }
}