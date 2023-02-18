import java.util.*;

public class ChatRoom{

    List<User> user_list;
    List<String> log;

    public ChatRoom() {
        this.user_list = new ArrayList<User>();
        this.log = new ArrayList<String>();
    }

    public void addUser(User u) {
        this.user_list.add(u);
    }

    public void removeUser(User u) {
        this.user_list.remove(u);
    }

    public void addLog(User u, String message) {
        this.log.add(u.getName() + ": " + message);
    }

    public void showLog() {
        System.out.println("The followings are chat history: ");
        for (String s : log) {
            System.out.println(s);
        }
    }



}