package com.polymor;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author Nevri on 2021/4/5
 * @Title:
 * @Description:
 */
public class Factory {

    public static Boss  function ( String name ) {
        if (name.equals("A")){
            return   new StaffA() ;
        }else if (name.equals("B")){
            return   new StaffB() ;
        }else{
            return new Boss() ;
        }
    }



}
