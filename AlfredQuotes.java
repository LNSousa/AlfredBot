import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("kk");
        String hourString = formatter.format(date);
        String time;
        switch (hourString) {
            case "22": case "23": case "24": case "1": case "2": case "3": case "4": 
                time = "night";
                break;
            case "5": case "6": case "7": case "8": case "9": case "10": case "11":
                time = "morning";
                break;
            case "12": case "13": case "14": case "15": case "16":
                time = "afternoon";
                break;
            case "17": case "18": case "19": case "20": case "21":
                time = "evening";
                break;
            default:
                time = "day";
        }
        return "Good " + time + ", lovely to see you.";
    }
    
    public String dateAnnouncement() {
        java.util.Date date = new java.util.Date();  
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String response = conversation.indexOf("Alexis") >= 0 ?  "Right away, sir. She certainly isn't sophisticated enough for that." : conversation.indexOf("Alfred") >= 0 ? "At your service. As you wish, naturally." : "Right. And with that I shall retire.";
        return response;
    }
    
    public String youTalkTooMuch(String speech) {
        return speech.length() >= 100 ? "Sir, you are blabbering. Please condense your thoughts." : "Yes, sir. I understand.";
    }
}
