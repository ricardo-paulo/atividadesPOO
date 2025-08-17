package net.ricardo_paulo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private final String name = "Paulo Ricardo";
    private final int age = 18;
    private final String email = "nobody@email.io.234domain";
    private final String phoneNumber = "(99) 99999-9999";
    private Client client;

    @BeforeEach
    void before() {
        client = new Client(name, age, email, phoneNumber);
    }

    @Test
    void getName() {
        String result = client.getName();
        assertEquals(name, result);
    }

    @Test
    void setName() {
        String newName = "Gamer Básico";
        client.setName(newName);
        assertEquals(newName, client.getName());
    }

    @Test
    void getAge() {
        int result = client.getAge();
        assertEquals(result, age);
    }

    @Test
    void isMajor() {
        boolean result = client.isMajor();
        assertTrue(result);

        boolean result2 = client.isMajor();
        client.setAge(17);
        assertFalse(result2);
    }

    @Test
    void setAge() {
        int newAge = 19;
        client.setAge(newAge);
        assertEquals(19, client.getAge());
    }

    @Test
    void getEmail() {
        String result = client.getEmail();
        boolean hasAt = result.contains("@");
        boolean isLowerCase = result.toLowerCase().equals(result);
        assertTrue(hasAt);
        assertTrue(isLowerCase);
    }

    @Test
    void setEmail() {
        String newEmail = "setThisLongEmail@farFarFar.comand";
        client.setEmail(newEmail);
        assertEquals(newEmail, client.getEmail());
    }

    @Test
    void updateEmail() {
        String newEmail = "setThisLongEmail@farFarFar.comand";
        client.setEmail(newEmail);
        assertEquals(newEmail, client.getEmail());

        client.setEmail(email);
        assertEquals(email, client.getEmail());
    }

    @Test
    void getPhoneNumber() {
        String result = client.getPhoneNumber();
        assertEquals(phoneNumber, result);
    }

    @Test
    void setPhoneNumber() {
        String newPhoneNumber = "(00) 00000-0000";
        client.setPhoneNumber(newPhoneNumber);
        assertEquals(newPhoneNumber, client.getPhoneNumber());
    }

    @Test
    void showUserInfo() {

    }
}