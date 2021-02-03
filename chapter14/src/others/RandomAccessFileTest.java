package others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        // RandomAccessFile 파일포인터가 LP판처럼 이동하기 때문에
        // (파일이 쓰여지면 한번왔던 곳을 읽거나 쓰려면 그곳으로 포인터를 잡아줘야함 seek(n))
        // 유의해야한다.
        rf.writeInt(100);
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14);
        rf.writeUTF("안녕하세요");

        rf.seek(0);
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

        rf.close();

    }

}
