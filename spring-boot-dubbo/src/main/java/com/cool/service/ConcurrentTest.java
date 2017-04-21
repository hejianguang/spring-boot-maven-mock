package com.cool.service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by zw on 2017/4/19.
 */
public class ConcurrentTest {

    final Map<String, String> hashMap = new HashMap<String, String>(2);
    final Hashtable hashtable = new Hashtable(2);
    final ConcurrentMap concurrentMap = new ConcurrentHashMap(2);
    public void hashMapTest() throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
//                            hashMap.put(UUID.randomUUID().toString(), "");
//                            hashtable.put(UUID.randomUUID().toString(), "");
                            concurrentMap.put(UUID.randomUUID().toString(), "");
                        }
                    }, "ftf" + i).start();
                    System.out.println("ftf" + i);
                }
            }
        }, "ftf");
        t.start();
        t.join();
    }

    private static final int nthread = 100;
    private static final Executor exec = Executors.newFixedThreadPool(nthread);

    public void executerTest() throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true){
            final Socket connect = serverSocket.accept();

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // handle request
                }
            };
            exec.execute(runnable);
        }
    }
    public static void main(String[] args) throws Exception{
        long starttime = System.currentTimeMillis();
        new ConcurrentTest().hashMapTest();
        long endtime = System.currentTimeMillis();
        System.out.print("elapsed time:" + String.valueOf(endtime - starttime));
    }
}
