
public class WrapperComparable implements Comparable<WrapperComparable> {

    private Integer integer;

    public WrapperComparable(Integer integer) {
        if (integer == null) {
            integer = 0;
        }
        this.integer = integer;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public int compareTo(WrapperComparable otherWrapperComparable) {
        return -(integer.compareTo(otherWrapperComparable.getInteger()));
    }

    @Override
    public String toString(){
        return "WrapperComparable("+integer+ ")";
    }
}
