package fr.neosoft.record_pattern;

public sealed interface Contained permits Container, Phones, Toys {
    String companyName();
    Weight weight();
}
