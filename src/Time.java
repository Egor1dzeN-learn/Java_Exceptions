public interface Time {
    public void setTime(TypeTime type,int time ) throws TimeException;
    void move_forward(TypeTime type, int time) throws TimeException;
}
