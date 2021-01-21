public class CheckAmountPeople {

    public static void main (String[] args) {

    }

    public static String checkAmountAndLevel(int amount, String level) {
        if(!level.matches("yellow|green|red")) {return "Undefined level";}
        int limit = getLimit(level);
        return checkLevelStatus(amount, limit);
    }

    private static String checkLevelStatus(int amount, int limit) {
        if (amount <= limit) {return "Amount of people is okay";}
        else {return "Amount of people is not okay";}
    }

    private static int getLimit(String level) {
        switch (level) {
            case "green":
                return 60;
            case "yellow":
                return 30;
            case "red":
            default:
                return -1;
        }
    }

}
