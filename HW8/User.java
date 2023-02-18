public abstract class User {
    private String userName;
    public ChatRoom user_room;

    public User(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return this.userName;
    }

    public ChatRoom getRoom() {
        return this.user_room;
    }

    public void JoinChatRoom(ChatRoom room) {
        room.addUser(this);
        this.user_room = room;
        System.out.println(this.userName + " Join room successful!");
    }

    public void QuitChatRoom() {
        this.user_room.removeUser(this);
        System.out.println(this.userName + " Leave the room");

    }

    public abstract void SendRandomMessage();
}
