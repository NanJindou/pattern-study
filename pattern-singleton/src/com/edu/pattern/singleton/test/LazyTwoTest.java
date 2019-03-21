package com.edu.pattern.singleton.test;

import com.edu.pattern.singleton.lazy.LazyOne;
import com.edu.pattern.singleton.lazy.LazyTwo;

/**
 * 测试时间  有了synchronized互斥锁，速度太慢
 */
public class LazyTwoTest {

        public static void main(String[] args){
            long start= System.currentTimeMillis();
            for(int i = 0;i<2000000;i++){
                Object obj = LazyTwo.getInstance();
            }
            long end = System.currentTimeMillis();
            System.out.println("LazyTwo总耗时:"+(end - start));

            long start2= System.currentTimeMillis();
            for(int i = 0;i<2000000;i++){
                Object obj = LazyOne.getInstance();
            }
            long end2 = System.currentTimeMillis();
            System.out.println("LazyOne总耗时:"+(end2 - start2));
        }

}
