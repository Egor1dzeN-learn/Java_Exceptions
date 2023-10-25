public class TimeException extends Exception{
    @Override
    public String getMessage() {
        return "Не правильно введено время";
    }
}
