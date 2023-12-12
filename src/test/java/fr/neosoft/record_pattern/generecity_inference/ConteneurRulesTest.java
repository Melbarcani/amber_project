package fr.neosoft.record_pattern.generecity_inference;

import org.junit.jupiter.api.Test;

class ConteneurRulesTest {

    @Test
    void recordInference() {
        var rules = new ConteneurRules();
        var conteneur = new Conteneur<>(new Conteneur<>(new Element("elementName")));
        rules.test2(conteneur);
    }

}