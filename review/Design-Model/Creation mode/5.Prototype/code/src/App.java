public class App {
    public static void main(String[] args) throws Exception {
        Sheelp sheelpDolly = new Sheelp("Dolly", 2);
        sheelpDolly.friend=new Cow("Tom",1);

        Sheelp sheelp = (Sheelp) sheelpDolly.clone();
        Sheelp sheelp2 = (Sheelp) sheelpDolly.clone();
        Sheelp sheelp3 = (Sheelp) sheelpDolly.clone();

        System.out.println("sheelp1:" + sheelp + ", hashcode" + sheelp.hashCode());
        System.out.println("sheelp1's friend: " + sheelp.friend.toString() + ", hashcode" + sheelp.friend.hashCode());
        System.out.println("sheelp2:" + sheelp2 + ", hashcode" + sheelp2.hashCode());
        System.out.println("sheelp2's friend: " + sheelp2.friend.toString() + ", hashcode" + sheelp2.friend.hashCode());
        System.out.println("sheelp3:" + sheelp3 + ", hashcode" + sheelp3.hashCode());
        System.out.println("sheelp3's friend: " + sheelp3.friend.toString() + ", hashcode" + sheelp3.friend.hashCode());

    }
}
