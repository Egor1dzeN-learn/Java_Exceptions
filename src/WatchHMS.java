public class WatchHMS extends WatchHM {
    private int second;

    public WatchHMS(int count, String name, int hour, int minute, int second) {
        super(count, name, hour, minute);
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    @Override
    public void get_time() {
        System.out.println(hour+" : "+minute);
    }

    @Override
    public void setTime(TypeTime type, int time) throws TimeException {
        if (type != TypeTime.SECOND)
            super.setTime(type, time);
        else {
            if (!(time >= 0 && time <= 59))
                throw new TimeException("Секунды должны быть в пределах от 0 до 59");

            setSecond(time);
            System.out.println("Успешно установлено!");
        }
    }

    @Override
    public void move_forward(TypeTime type, int time) throws TimeException {
        if (type != TypeTime.SECOND)
            super.move_forward(type, time);
        else {
            if (!(time >= 0 && time <= 59))
                throw new TimeException("Укажите положительное время");
            setSecond((time + second)%60);
        }

    }
}
