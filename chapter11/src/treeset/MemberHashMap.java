package treeset;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (hashMap.containsKey(memberID)) {
            hashMap.remove(memberID);
            return true;
        }
        System.out.println("회원번호가 없습니다.");
        return false;
    }

    // k,v둘중 하나를 선택해서 이터레이션해야함.
    public void showAllMember() {
        // key로 순회하는 법
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();

        // // value로 순회하는 법
        // // 콜렉션으로 반환이 됨.
        // hashMap.values().iterator();
    }
}
