public class WatchHM extends Watch implements Time{
    protected int hour;
    protected int minute;
    public WatchHM(int count, String name, int hour, int minute) {
        super(count, name);
        this.hour = hour;
        this.minute = minute;
    }
    @Override
    public void setTime(TypeTime type, int time) throws TimeException {
        if(type == TypeTime.HOUR){
            if(!(time>=0 && time<=23))
                throw new TimeException("Часы должны быть в пределах от 0 до 23");
            setHour(time);
        }
        else if(type == TypeTime.MINUTE){
            if(!(time>=0 && time<=59))
                throw new TimeException("Минуты должны быть в пределах от 0 до 59");
            setHour(time);
        }
        else
        {
            throw  new TimeException("Секунды не подходят для выбранного времени");
        }
        System.out.println("Успешно установлено!");
    }
    @Override
    public void move_forward(TypeTime type, int time) throws TimeException {
        if(type == TypeTime.HOUR){
            if(time<0)
                throw new TimeException("Укажите положительное время");
            setHour((hour+time)%24);
        }
        else if(type == TypeTime.MINUTE){
            if(time<0)
                throw new TimeException("Укажите положительное время");
            setHour((minute+time)%60);
        }
        else
        {
            throw  new TimeException("Секунды не подходят для выбранного времени");
        }
    }



    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


}
