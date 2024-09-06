package net.sauravApp.journalApp.service;

import net.sauravApp.journalApp.entity.User;
import net.sauravApp.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Disabled
@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Disabled
    @Test
    public void testFindByUserName(){
        //assertEquals(4, 2+2);
        //assertNotNull(userRepository.findByUserName("saurav"));
        User user = userRepository.findByUserName("ram");
        assertTrue(!user.getJournalEntries().isEmpty());

    }
    @Disabled
    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testsaveNewUser(User user){

        assertTrue(userService.saveNewUser(user));
    }



    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "10,2,12",
            "3,3,9"
    })
    public void test(int a, int b, int expected){

        assertEquals(expected, a+b);
    }

}
