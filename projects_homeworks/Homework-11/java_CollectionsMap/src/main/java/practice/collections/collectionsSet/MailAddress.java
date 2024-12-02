package practice.collections.collectionsSet;

import java.util.Objects;

public class MailAddress implements Comparable<MailAddress>{
    private String mail;

    public MailAddress(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailAddress that = (MailAddress) o;
        return Objects.equals(mail, that.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mail);
    }

    @Override
    public int compareTo(MailAddress mail) {
        return this.mail.compareTo(mail.mail);
    }

    @Override
    public String toString() {
        return
                "mail= " + mail;
    }
}
