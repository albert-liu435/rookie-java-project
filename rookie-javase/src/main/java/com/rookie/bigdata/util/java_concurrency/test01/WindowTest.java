package com.rookie.bigdata.util.java_concurrency.test01;

/**
 * @Class WindowTest
 * @Description
 * @Author rookie
 * @Date 2025/4/15 15:29
 * @Version 1.0
 */
public class WindowTest {

    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }

}

class Window extends Thread{


    private  int ticket = 100;
    @Override
    public void run() {

        while(true){

            if(ticket > 0){
                System.out.println(getName() + "：卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }

        }

    }
}
