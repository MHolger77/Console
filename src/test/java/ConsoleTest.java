import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {

    private Console console ;

    @Before
    public void setUp() throws Exception {
        console = new Console("console class testing");
    }

    @Test
    public void done() {

    }

    @Test
    public void doneln() {
    }

    @Test
    public void bold() {
    }

    @Test
    public void italic() {
    }

    @Test
    public void underline() {
    }

    @Test
    public void black() {
    }

    @Test
    public void red() {
    }

    @Test
    public void green() {
    }

    @Test
    public void yellow() {
    }

    @Test
    public void blue() {
    }

    @Test
    public void purple() {
    }

    @Test
    public void cyan() {
    }

    @Test
    public void grey() {
    }

    @Test
    public void white() {

    }

    @Test
    public void string(){
    }

    @Test
    public void finalize(){
        console.finalize();
        assertNull(console.toString());
    }



    @After
    public void tearDown() throws Exception {
        console = null;
    }
}
