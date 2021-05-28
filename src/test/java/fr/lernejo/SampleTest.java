package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void op() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 1, 2))
            .isEqualTo(3);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 4, 5))
            .isEqualTo(20);
    }

    @Test
    void fact_calc() {
        Sample sample = new Sample();

        Assertions.assertThat(sample.fact(10))
            .isEqualTo(3628800);
    }

    @Test
    void fact_throws() {
        Sample sample = new Sample();

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-24))
            .withMessage("N should be positive");
    }


}
