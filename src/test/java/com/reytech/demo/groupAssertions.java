

@Test void groupedAssertions() {
        Personne pers = new Personne("Nassur", "Moumadi");

        assertAll("personne", ()-> assertEquals("Nassur", pers.getFirstName()),
                () -> assertEquals("Moumadi", pers.getLastName()));
    }
