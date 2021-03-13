public class InstancesFactory {
    Object getInstance(int index) {
        assert (index == 1 || index == 2);
        switch (index) {
            case 1:
            return new Instance1();
            case 2:
            return new Instance2();
        }
        return null;
    }
/*    public Object getInstance(int index) throws Exception {
        if (!(index == 1 || index == 2)) {
            throw new Exception("Wrong index: " + index);
        }
        switch (index) {
            case 1:
                return new Instance1();
            case 2:
                return new Instance2();
        }
    }
*/    
    
}
class Instance1 {

}
class Instance2 {

}