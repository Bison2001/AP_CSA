public abstract class User {
    private String userName;
    public ChatRoom user_room;

    public User(String userName) {
        // TODO:
    }

    public String getName() {
        // TODO:
        return "";
    }

    public ChatRoom getRoom() {
        // TODO:
        return new ChatRoom();
    }

    public void JoinChatRoom(ChatRoom room) {
        // TODO:
    }

    public void QuitChatRoom() {
        // TODO:

    }

    public abstract void SendRandomMessage();

    public abstract void SendMessage(String message);
}
