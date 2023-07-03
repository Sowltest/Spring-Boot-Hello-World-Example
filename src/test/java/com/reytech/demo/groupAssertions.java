package com.reytech.demo;
import org.junit.juptier.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.reytech.demo.Personne;

@Test void groupedAssertions() {
        Personne pers = new Personne("Nassur", "Moumadi");

        assertAll("personne", ()-> assertEquals("Nassur", pers.getFirstName()),
                () -> assertEquals("Moumadi", pers.getLastName()));
    }
