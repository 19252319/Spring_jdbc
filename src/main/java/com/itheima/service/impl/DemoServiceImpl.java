package com.itheima.service.impl;

import com.itheima.exception.MyException;
import com.itheima.service.DemoService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DemoServiceImpl implements DemoService {
    @Override
    public void show1() {
        System.out.println("跑出类型转换异常");
        Object str = "zhangsan";
        Integer num = (Integer)str;

    }

    @Override
    public void show2() {
        System.out.println("抛出零异常");
        int i = 1/0;

    }

    @Override
    public void show3() throws FileNotFoundException {
        System.out.println("文件找不到异常.....");
        InputStream in = new FileInputStream("C:/xx/xxx/xxxx");
    }

    @Override
    public void show4() {
        System.out.println("空指针异常...");
        String str = null;
        str.length();

    }

    @Override
    public void show5() throws MyException {
        System.out.println("自定义异常");
        throw new MyException();

    }
}
