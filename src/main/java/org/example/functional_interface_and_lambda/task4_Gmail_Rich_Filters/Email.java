package org.example.functional_interface_and_lambda.task4_Gmail_Rich_Filters;

public class Email {
    private final String subject;
    private final String body;
    private final Boolean isImportant;

    public Email(String subject, String body, boolean isImportant){
        this.subject = subject;
        this.body = body;
        this.isImportant = isImportant;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public Boolean getImportant() {
        return isImportant;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", isImportant=" + isImportant +
                '}';
    }
}
