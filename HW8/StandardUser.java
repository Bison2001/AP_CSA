public class StandardUser extends User{
    
    public StandardUser(String userName) {
        super(userName);
    }

    public void SendRandomMessage() {
        super.user_room.addLog(this, "I'm a standard user");
        System.out.println("Message sent successful!");
    }
}
