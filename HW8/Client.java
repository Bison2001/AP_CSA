public class Client {
    public static void main(String[] args) {
        User u = new StandardUser("Bison");
        User p = new PremiumUser("Nicole");
        ChatRoom c = new ChatRoom();

        u.JoinChatRoom(c);
        p.JoinChatRoom(c);

        c.showUser();

        u.SendRandomMessage();

        p.SendRandomMessage();
        p.SendMessage("Hi everyone! Nice to meet you all");
        p.SendMessage("I'm " + p.getName());

        u.SendMessage("Nice to meet you too. " + "I'm " + u.getName());

        u.QuitChatRoom();
        p.QuitChatRoom();
        
        c.showUser();

        c.showLog();
    }
}
