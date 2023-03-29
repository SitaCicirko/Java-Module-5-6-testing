package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;                    // [2]
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Forum Test Suite")
class ForumTestSuite {
    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name")
    @Test                                                       // [6]
    void testCaseUsername() {                                   // [7]
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");  // [8]

        //When
        String result = simpleUser.getUsername();                // [9]

        String expectedResult = "theForumUser";                  // [10]

        //Then
        Assertions.assertEquals(expectedResult, result);         // [11]
    }

}
