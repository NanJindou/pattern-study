package com.edu.pattern.singleton.test;

import com.edu.pattern.singleton.hungry.Hungry;
import com.edu.pattern.singleton.lazy.LazyOne;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {

    public static void main(String[] args){

        int count = 200;
        //发令枪 ,计数器，当count使用完前，之前的代码都会被拦截，count使用完后，之前拦截的会一起运行
        final CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        //final Set<Hungry> syscSet = Collections.synchronizedSet(new HashSet<Hungry>());
        for(int i=0;i<count;i++){
            final int finalI = i;
            new Thread(){
                @Override
                public void run() {
                    try{
                        // 阻塞
                        // count = 0 就会释放所有的共享锁
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //syscSet.add(Hungry.getInstance());

                    /** 饿汉模式测试
                    Hungry obj = Hungry.getInstance();
                    System.out.println(System.currentTimeMillis()+":"+ finalI +":"+obj);
                     */

                    Object obj1 = LazyOne.getInstance();
                    System.out.println(System.currentTimeMillis()+":"+ finalI +":"+obj1);
                }
            }.start(); //每循环一次，就是启用一个线程
            //每次启动一个线程，count --
            latch.countDown();
        }


        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));

    }




}
