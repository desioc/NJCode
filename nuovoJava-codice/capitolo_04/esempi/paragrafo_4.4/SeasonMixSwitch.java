public class SeasonMixSwitch {
    public static void main(String args[]) {
        int month = 4;
        if (args.length!=0) {
            month = Integer.parseInt(args[0]);
        }
        String season;
        switch (month) {
             default: //the default clause is optional
            season ="not identifiable";
            break;
            case 12:
            case 1:
            case 2:
            season ="winter";
            break;
            case 3:
            case 4:
            case 5:
            season ="spring";
            break; //without this break we would have season = summer
            case 6:
            case 7:
            case 8:
            season ="summer";
            break;
            case 9:
            case 10:
            case 11:
            season ="autumn";
            break;
        }
        System.out.println("The season is "+ season);
    }
}