package what;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class DateTimeTest {
    @Mock
    DateTime dateTime;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        dateTime = new DateTime();
    }
    @DisplayName("Print Countdown")
//
//    @Test
//    void now() {
//    }

    @Test
    void test_findChristmas() {
    }
}