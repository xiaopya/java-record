package com.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @projectName: java学习记录
 * @package: com.junit
 * @className: StringUtil
 * @author: cyl
 * @description: TODO 单元测试
 * @date: 2024/1/22 20:25
 * @version: 1.0
 */
public class StringUtilTest {
    @Test
    public void printStringLength(){
        StringUtil.printStringLength("null");
    }

    @Test
    public void getMaxIndex(){
        int index = StringUtil.getMaxIndex("ceshi");
        // 断言
        Assert.assertEquals("方法内部有问题",4,index);
    }
}
