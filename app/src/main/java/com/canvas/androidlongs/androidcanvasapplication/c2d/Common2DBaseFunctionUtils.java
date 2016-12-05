package com.canvas.androidlongs.androidcanvasapplication.c2d;

/**
 * Created by androidlongs on 16/12/5.
 * 站在顶峰，看世界
 * 落在谷底，思人生
 */

public class Common2DBaseFunctionUtils {
    private Common2DBaseFunctionUtils(){}
    private static class SingleFunction{
        private static Common2DBaseFunctionUtils sCommon2DBaseFunctionUtils =new Common2DBaseFunctionUtils();
    }
    public static Common2DBaseFunctionUtils getInstance(){
        return SingleFunction.sCommon2DBaseFunctionUtils;
    }


    
}
