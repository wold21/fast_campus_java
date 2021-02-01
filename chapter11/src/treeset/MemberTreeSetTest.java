package treeset;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member lee = new Member(100, "lee");
        Member kim = new Member(200, "kim");
        Member han = new Member(300, "han");
        Member kang = new Member(400, "kang");

        manager.addMember(lee);
        manager.addMember(kim);
        manager.addMember(han);
        manager.addMember(kang);

        manager.showAllMember();
    }

}
