package gt.com.alodev.refactor.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImportDataTest {

    public ImportData importData;

    @BeforeEach
    public void setUp(){
        this.importData = new ImportData();
    }

    @Test
    public void shouldProcessData() {
        var result = this.importData.processData("holamundonormal, hola, jo45");
        var expected = 2;

        Assertions.assertEquals(expected,result );
    }
}
