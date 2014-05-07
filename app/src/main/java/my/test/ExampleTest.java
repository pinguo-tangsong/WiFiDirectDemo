package my.test;

import android.test.InstrumentationTestCase;
import android.widget.Toast;

/**
 * Created by tangsong on 4/30/14.
 */
public class ExampleTest extends InstrumentationTestCase {

    public void test() throws Exception {
        final int expected = 1;

        final int reality = 5;

        Toast.makeText(getInstrumentation().getContext(), "ssssss", Toast.LENGTH_LONG).show();

    }

}
