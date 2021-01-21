public class CheckAmountPeople {

    public static void main (String[] args) {

        int peopleInRoom = 29;
        System.out.println(checkGreater30(peopleInRoom));

    }

    public static String checkGreater30(int amount) {
        if (amount <= 30) { return "Less than or 30 people";}
        return "More than 30 people";
    }
}
