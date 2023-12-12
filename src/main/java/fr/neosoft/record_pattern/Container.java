package fr.neosoft.record_pattern;

public record Container<T extends Contained>(String companyName, Weight weight, T item) implements Contained {
}
