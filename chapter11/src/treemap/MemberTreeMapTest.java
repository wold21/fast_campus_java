package treemap;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap manager = new MemberTreeMap();

        Member lee = new Member(100, "lee");
        Member kang = new Member(400, "kang");
        Member han = new Member(300, "han");
        Member kim = new Member(200, "kim");

        manager.addMember(lee);
        manager.addMember(kim);
        manager.addMember(han);
        manager.addMember(kang);

        manager.showAllMember();

        manager.removeMember(200);
        manager.showAllMember();
    }

}
