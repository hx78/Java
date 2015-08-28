package com.hx78.smallcase;

/**
 * Created by linming on 2015/8/28 0028.
 */
public class Main {
    public static void main(String args[]) {
        final Account account = new Account();
        account.setMoney(500);
        //1 使用synchronized
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (account) {
                    System.out.println("1 sleeping...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    account.setMoney(account.getMoney() - 100);
                    System.out.println("1:" + account.getMoney());
                    System.out.println("1 wake up");
                }
            }
        }).start();

        //2 没有使用synchronized，即使1在sleeping（没有释放锁)，依然可以操作account
        new Thread(new Runnable() {
            @Override
            public void run() {
                account.setMoney(account.getMoney() + 200);
                System.out.println("2:" + account.getMoney());
            }
        }).start();

        //3 使用synchronized，1在sleeping（没有释放锁)，不可以操作account
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (account) {
                    account.setMoney(account.getMoney() + 200);
                    System.out.println("3:" + account.getMoney());
                }
            }
        }).start();
    }
}
