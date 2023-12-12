package fr.neosoft.record_pattern;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerTest {
    /*@Test
    void simpleRecordPattern(){
        Contained toysLego = new Toys("Lego", 100);
        Contained phonesSamsung = new Phones("Samsung", 200);
        List<Container<Contained>> containers = List.of(new Container<>("A123", List.of(toysLego, phonesSamsung)));
        ContainerShip containerShip = new ContainerShip("Titanic", containers);
        assertThat(containerShip.totalWeight()).isEqualTo(300);
    }

    @Test
    void printAllPhonesCompanyNames(){
        Contained toysLego = new Toys("Lego", 100);
        Contained phonesSamsung = new Phones("Samsung", 200);
        List<Container<Contained>> containers = List.of(new Container<>("A123", List.of(toysLego, phonesSamsung)));
        ContainerShip containerShip = new ContainerShip("Titanic", containers);
        assertThat(containerShip.phonesCompaniesShipped()).isEqualTo("Samsung");
    }*/
}
