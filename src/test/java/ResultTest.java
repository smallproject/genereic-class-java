import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void success() {
        // Arrange
        var data = "Succes data";

        // Act
        var result = Result.success(data);

        // this is a duplicate declaration for readability
//        Result<String> resultString =  Result.success("Succes data");

        // Assert
        assertEquals(true, result.isSuccess());
        assertEquals(data, result.getValue());
        assertEquals("Result{success, value='" + data+ "'}", result.toString());
    }

    @Test
    void failure() {
        // Arrange
        var errorText = "Fail data";

        // Act
        var result = Result.failure(errorText);

        // Assert
        assertEquals(false, result.isSuccess());
        assertEquals(errorText, result.getErrorMessage());
        assertEquals("Result{failure, errorMessage='" + errorText+ "'}", result.toString());
    }
}