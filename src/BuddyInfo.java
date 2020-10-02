public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Tom");

        System.out.println("Hello " + buddy.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
