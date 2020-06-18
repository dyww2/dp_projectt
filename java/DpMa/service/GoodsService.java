package DpMa.service;

import DpMa.pojo.dto.ResponseDTO;
import DpMa.pojo.entity.Goods;

import java.util.Map;


public interface GoodsService {
    /**
     * 增加商品的功能，返回res结果true或者false,返回msg为消息
     *
     * @param goods
     * @return
     */
    Map<String, Object> add(Goods goods);

    /**
     * 根据商品类型寻找这个类型的所有商品
     *
     * @param typeId
     * @return
     */
    ResponseDTO getGoodsByTypeId(Integer typeId);

    /**
     * 根据商品id查询商品
     *
     * @param goodsId
     * @return
     */
    Goods getGoodsDetail(Integer goodsId);
}
