package org.example.Lesson9;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.nio.file.Path;

public class XmlExample {
    public static void main(String[] args) throws JAXBException {
        BannedUser user1 = new BannedUser("Jin", "Kim", 33, "kim@ya.ru", 32000);

        Path path = Path.of("users.xml");

        JAXBContext context = JAXBContext.newInstance(BannedUser.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(user1, path.toFile());

        Unmarshaller unmarshaller = context.createUnmarshaller();
        BannedUser bannedUser = (BannedUser) unmarshaller.unmarshal(path.toFile());
        System.out.println(bannedUser);
        bannedUser.setSalary(1000);
    }
}
