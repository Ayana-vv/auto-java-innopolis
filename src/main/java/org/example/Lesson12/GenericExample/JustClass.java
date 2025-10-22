package org.example.Lesson12.GenericExample;

import org.example.Lesson6.EmailNotifier;
import org.example.Lesson9.BannedUser;

public class JustClass {
    public static void main(String[] args) {
        HttpResponse<BannedUser> httpResponse = new HttpResponse<>(200, new BannedUser());
        System.out.println(httpResponse.getCode());
        System.out.println(httpResponse.getBody());

        HttpResponse<EmailNotifier> httpResponse2 = new HttpResponse<>(200, new EmailNotifier());
        System.out.println(httpResponse2.getCode());
        System.out.println(httpResponse2.getBody());
    }
}
