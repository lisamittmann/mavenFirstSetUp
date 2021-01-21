public class CheckAmountPeople {

    public static void main (String[] args) {

    }

    public static String checkGreater30(int amount, String level) {
        switch (level) {
            case "green":
                if (amount <= 60) {return "Amount of people is okay";}
                else {return "Amount of people is not okay";}
            case "yellow":
                if (amount <= 30) {return "Amount of people is okay";}
                else {return "Amount of people is not okay";}
            case "red":
                return "Amount of people is not okay";
            default:
                return "Undefined level or amount";
        }
    }
}
