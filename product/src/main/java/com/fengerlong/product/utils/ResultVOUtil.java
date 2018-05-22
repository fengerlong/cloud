package com.fengerlong.product.utils;

import com.fengerlong.product.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object productVOList){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(productVOList);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
