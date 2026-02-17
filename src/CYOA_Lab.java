import java.util.Scanner;

public class CYOA_Lab {
    static void main(String[] args) {

        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_RESET = "\u001B[0m";
        Scanner scanner = new Scanner(System.in);

        String current_room;
        System.out.println("""
                \s
                            o x o x o x o . . .
                          o      _____            _______________ ___=====__T___
                        .][__n_n_|DD[  ====_____  |    |.\\/.|   | |   |_|     |_
                       >(________|__|_[_________]_|____|_/\\_|___|_|___________|_|
                       _/oo OOOOO oo`  ooo   ooo   o^o       o^o   o^o     o^o
                 -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-
                \s
                You are on a train platform, there is a train that is allowing people to get on for free to a random destination. You may enter:
                1. Passenger Cabin
                State the name or the number of the room you wish to enter in the next line (the casing does not matter):""");

        current_room = scanner.nextLine();

        if ("Passenger Cabin".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
            System.out.println("\nYou are now in the " + current_room + ". You may enter:\n1. Conductor's Cabin\n2. Freight Cabin\n3. Go find a seat\n" +
                    "State the name of the room you wish to enter in the next line");
            current_room = scanner.nextLine();

            if ("Conductor's Cabin".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                System.out.println("""
                        
                        You are now in the Conductor's Cabin. You may enter:
                        1. Engine Room
                        2. Coal Room
                        State the name of the room you wish to enter in the next line""");
                current_room = scanner.nextLine();

                if ("Engine Room".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                    System.out.println("\n You are now in the Engine Room");

                } else if ("Coal Room".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                    System.out.println("\n You are now in the Coal Room");

                } else {
                    System.out.println(ANSI_RED + "\nThe room you inputted is incorrect, please try again");
                }

            } else if ("Freight Cabin".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                System.out.println("""
                        
                        You are now in the Freight Cabin. You may enter:
                        1. Kitchen room
                        2. Caboose
                        State the name of the room you wish to enter in the next line""");
                current_room = scanner.nextLine();

                if ("Kitchen Room".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                    System.out.println("\nYou are now in the Kitchen Room");

                } else if ("Caboose".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                    System.out.println("\nYou are now in the Caboose");

                } else {
                    System.out.println(ANSI_RED + "\nThe room you inputted is incorrect, please try again");
                }

            } else if ("Go find a seat".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 3) {
                System.out.println("""
                        \nYou are now sitting at a table with a window. You may:
                        1. Take a nap
                        2. Enjoy the view
                        State the name of the room you wish to enter in the next line""");
                current_room = scanner.nextLine();

                if ("Take a nap".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                    System.out.println("\nYou are now taking a nap, oops you missed your destination");

                } else if ("Enjoy the view".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                    System.out.println(ANSI_GREEN + """
                            \s
                                .                  .-.    .  _   *     _   .
                                       *          /   \\     ((       _/ \\       *    .
                                     _    .   .--'\\/\\_ \\     `      /    \\  *    ___
                                 *  / \\_    _/ ^      \\/\\'__        /\\/\\  /\\  __/   \\ *
                                   /    \\  /    .'   _/  /  \\  *' /    \\/  \\/ .`'\\_/\\   .
                              .   /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _
                                 /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\
                               /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\
                              /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.
                            @/        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\%""");
                    System.out.print(ANSI_BLUE + """
                            @&8jgs@@%% @)&@&(88&@.-_=_-=_-=_-=_-=_.8@% &@&&8(8%@%8)(8@%8 8%@)%
                            @88:::&(&8&&8:::::%&`.~-_~~-~~_~-~_~-~~=.'@(&%::::%@8&8)::&#@8::::
                            `::::::8%@@%:::::@%&8:`.=~~-.~~-.~~=..~'8::::::::&@8:::::&8:::::'
                             `::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.'
                            """);
                    System.out.println(ANSI_RESET + """
                            Congratulations! You look outside the window, and enjoy the views of the lovely mountains, river,
                            and nature. You can't wait to see where you will end up, but you have a feeling its going to be good.""");

                } else {
                    System.out.println(ANSI_RED + "\nThe room you inputted is incorrect, please try again");
                }

            } else {
                System.out.println(ANSI_RED + "\nThe room you inputted is incorrect, please try again");
            }

        } else {
            System.out.println(ANSI_RED + "\nThe room you inputted is incorrect, please try again");
        }
    }
}