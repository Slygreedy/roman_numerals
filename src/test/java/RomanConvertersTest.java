import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanConvertersTest {

    @Test
    public void Test_0_is_null() {
        assertThat(RomanConverters.convert(0), is(equalTo("")));
    }

    @Test
    public void Test_1_is_I() {
        assertThat(RomanConverters.convert(1), is(equalTo("I")));
    }

    @Test
    public void Test_2_is_II() {
        assertThat(RomanConverters.convert(2), is(equalTo("II")));
    }

    @Test
    public void Test_5_is_V() {
        assertThat(RomanConverters.convert(5), is(equalTo("V")));
    }

    @Test
    public void Test_6_is_VI() {
        assertThat(RomanConverters.convert(6), is(equalTo("VI")));
    }

    @Test
    public void Test_10_is_X() {
        assertThat(RomanConverters.convert(10), is(equalTo("X")));
    }

    @Test
    public void Test_20_is_XX() {
        assertThat(RomanConverters.convert(20), is(equalTo("XX")));
    }

    @Test
    public void Test_26_is_XXVI() {
        assertThat(RomanConverters.convert(26), is(equalTo("XXVI")));
    }
}