package com.github.study;

import io.netty.util.concurrent.FastThreadLocal;
import org.junit.Test;

/**
 * @author bozhu
 * @description
 * @data 2019/9/7
 */
public class FastThreadLocalTest {

    /*private static final FastThreadLocal<Integer> fastThreadlocal1 = new FastThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() throws Exception {
            return 100;
        }

        @Override
        protected void onRemoval(Integer value) throws Exception {
            System.out.println(value + ":我被删除了");
        }
    };

    private static final FastThreadLocal<String> fastThreadlocal2 = new FastThreadLocal<String>() {
        @Override
        protected String initialValue() throws Exception {
            return "haha";
        }

        @Override
        protected void onRemoval(String value) throws Exception {
            System.out.println(value + ":我被删除了");
        }
    };

    @Test
    public void testSetAndGetByCommonThread() {
        Integer integer = fastThreadlocal1.get();
        String s = fastThreadlocal2.get();
        System.out.println(integer);
        System.out.println(s);
    }*/


    @Test
    public void cxsTest() {
        FastThreadLocal<String> threadLocal = new FastThreadLocal<>();
        threadLocal.set("test FastThreadLocal set");
        System.out.println(threadLocal.get());
        threadLocal.remove();
        System.out.println(threadLocal.get());

    }


}
