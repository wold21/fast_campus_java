package treemap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap manager = new MemberHashMap();

        Member lee = new Member(100, "lee");
        Member kim = new Member(200, "kim");
        Member han = new Member(300, "han");
        Member kang = new Member(400, "kang");
        Member kang2 = new Member(400, "kang2");

        manager.addMember(lee);
        manager.addMember(kim);
        manager.addMember(han);
        manager.addMember(kang);
        manager.addMember(kang2);

        manager.showAllMember();

        manager.removeMember(200);
        manager.showAllMember();
    }

}
