package fr.neosoft.record_pattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainedRulesStrategyTest {

    @Test
    void whenToysAdd100ToWeight() {
        var strategy = new ContainedRulesStrategy();
        Contained toysLego = new Toys("Lego", new Weight(100, 150));
        var netWeight = strategy.computeNetWeight(toysLego);
        assertThat(netWeight).isEqualTo(200);
    }

    @Test
    void whenPhonesAdd200ToWeight() {
        var strategy = new ContainedRulesStrategy();
        Contained phonesSamsung = new Phones("Samsung", new Weight(200, 300));
        var netWeight = strategy.computeNetWeight(phonesSamsung);
        assertThat(netWeight).isEqualTo(400);
    }

}