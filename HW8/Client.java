public class Client {
    public static void main(String[] args) {
        User u = new StandardUser("Bison");
        ChatRoom c = new ChatRoom();
        u.JoinChatRoom(c);
        u.SendRandomMessage();
        u.QuitChatRoom();

        c.showLog();
    }
}
