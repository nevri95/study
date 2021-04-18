package com.dynamictest;

import lombok.Data;

/**
 * @author Nevri on 2021/4/11
 * @Title:
 * @Description:
 */
@Data
public class ShellResult {
    //序列化名称必须一样 否则找不到对应的值
    private  String  casename;
    //注意值类型对应
    private  boolean  result;

}
