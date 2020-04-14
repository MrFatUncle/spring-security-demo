/**
 * FileName: ReadWriteLockTest
 * Author:   liaocm
 * Date:     2020/4/14 9:07
 * Description:
 * History:
 */
package cn.lcm.springsecuritydemo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
    }
}
