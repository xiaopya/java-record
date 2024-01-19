package com.basics.demo1;

/**
 * @projectName: code
 * @package: com.basics.demo1
 * @className: People
 * @author: chenYongLong
 * @description: TODO 囚犯类
 * @date: 2024/1/19 19:58
 * @version: 1.0
 */
public class People {
    private int code;
    private int index;

    public People() {
    }

    public People(int code, int index) {
        this.code = code;
        this.index = index;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "People{" +
                "code=" + code +
                ", index=" + index +
                '}';
    }
}
