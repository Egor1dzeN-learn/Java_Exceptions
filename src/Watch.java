public class Watch {
    protected int count;
    protected String name;

    public Watch(int count, String name) {
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
