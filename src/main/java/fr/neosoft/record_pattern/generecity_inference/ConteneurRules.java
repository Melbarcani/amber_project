package fr.neosoft.record_pattern.generecity_inference;

public class ConteneurRules {
    public String test2(Conteneur<Conteneur<Element>> bo) {
        // With generic type:
        if(bo instanceof Conteneur<Conteneur<Element>>(Conteneur(Element(String name)))){
            return name;
        }
        // By inference, we can omit the generic type, the record pattern compiler will infer it:
        if (bo instanceof Conteneur(Conteneur(Element(String name)))) {
            return name;
        }
        return "";
    }
    record Point(int x, int y) {}
}
