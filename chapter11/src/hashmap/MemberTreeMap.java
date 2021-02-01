package hashmap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (treeMap.containsKey(memberID)) {
            treeMap.remove(memberID);
            return true;
        }
        System.out.println("회원번호가 없습니다.");
        return false;
    }

    // k,v둘중 하나를 선택해서 이터레이션해야함.
    public void showAllMember() {
        // key로 순회하는 법
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();

        // // value로 순회하는 법
        // // 콜렉션으로 반환이 됨.
        // treeMap.values().iterator();
    }
}
