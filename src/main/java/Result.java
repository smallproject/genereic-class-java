// adds <T> generic to class
// changing class to generic interpretation
public class Result <T> {
    //declaration are multiple return values
    private final T value;
    private final String errorMessage;
    private final boolean success;

    //constructor is private
    private Result(T value, String errorMessage, boolean success) {
        this.value = value;
        this.errorMessage = errorMessage;
        this.success = success;
    }

    //factory method
    public static <T> Result<T> success(T value) { return new Result<>(value, null, true);}
    public static <T> Result<T> failure(String errorMessage) { return new Result<>(null, errorMessage, false);}


    //getters are public without setters
    public T getValue() { return value; }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isSuccess() { return success; }

    // overwrites standard toString functionality
    @Override
    public String toString() {
        if (success) return "Result{success, value='" + value + "'}";
        else return "Result{failure, errorMessage='" + errorMessage + "'}";
    }
}
