package hashmap;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberID;
    private String memberName;

    public Member() {

    }

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return this.memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return (this.memberID == member.memberID);
        }
        return false;
    }

    // //Comparable<Member>
    // // 오름차순 정렬 - int (내림차순 -> * -1)
    // // string은 이미 구현이되어있음.
    // @Override
    // public int compareTo(Member member) {
    // // return (this.memberID - member.memberID);
    // return this.memberName.compareTo(member.getMemberName());
    // }

    // Comparator<Member>
    // 파라미터가 두개면 첫번째 멤버가 this.
    // 두번째 멤버가 넘어온 값.
    // 생성자에 comparator를 쓴다고 명시를 해줘야함.
    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberID - member2.memberID);
    }

}