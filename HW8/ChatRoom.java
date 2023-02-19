import java.util.*;

public class ChatRoom{

    List<User> user_list;
    List<String> log;

    public ChatRoom() {
        // Initialize to arraylist
    }

    public void addUser(User u) {
        // TODO:
        
    }

    public void removeUser(User u) {
        // TODO:
    }

    public void addLog(User u, String message) {
        // TODO:
    }

    public void showLog() {
        // TODO:
    }

    public void showUser() {
        System.out.println("The followings are users in the room: ");
        for (User u : this.user_list) {
            System.out.print(u.getName() + " ");
        }
        System.out.println();
    }



}