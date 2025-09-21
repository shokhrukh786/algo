package org.example.functional_interface_and_lambda.task4_Gmail_Rich_Filters;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmailProcessor {

    public void processEmails(
            List<Email> emails,
            Predicate<Email> filter,
            Function<Email, String> transformer,
            Consumer<Email> action
    ){
        for (Email email : emails){
            if (filter.test(email)){
                String newBody = transformer.apply(email);
                System.out.println("Transformed body: " + newBody);
                action.accept(email);
            }
        }
    }
}
