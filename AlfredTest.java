public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testGuestGreeting2 = alfredBot.guestGreeting();
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );

        String speech = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque in nisl vitae neque pretium iaculis. Phasellus sed pretium magna, ac scelerisque magna. Maecenas imperdiet imperdiet ligula id luctus. Proin sit amet sapien sit amet ligula fermentum blandit ut at nunc. Donec id est enim. Mauris nec arcu eget justo hendrerit pretium. Integer et bibendum orci. Maecenas scelerisque lacus at nunc venenatis, sagittis venenatis erat consectetur. Curabitur eget porta nunc. Maecenas ornare tristique diam, non eleifend augue volutpat eu. Proin nec augue mi. Vestibulum dolor dolor, vestibulum vitae imperdiet a, mollis sit amet turpis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos.";
        String thoughts = "I want to decrease crime in Gotham.";
        String testYouTalkTooMuch = alfredBot.youTalkTooMuch(speech);
        String testYouDoNotTalkTooMuch = alfredBot.youTalkTooMuch(thoughts);
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreeting2);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(testYouTalkTooMuch);
        System.out.println(testYouDoNotTalkTooMuch);
    }
}