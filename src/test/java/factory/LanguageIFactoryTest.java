package factory;

import domain.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LanguageIFactoryTest {

    @Test
    public void createLanguage() {
        Language language = LanguageIFactory.createLanguage("Portuguese", "ISO123", "EP", "Portugal", "European Portuguese");
        System.out.println(language.toString());
        assertNotNull(language);
    }

}