package com.soft2242.shop.convert;

import com.soft2242.shop.entity.UserShoppingAddress;
import com.soft2242.shop.vo.UserAddressVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserAddressConvert {

    UserAddressConvert INSTANCE = Mappers.getMapper(UserAddressConvert.class);


    UserAddressVO convertToUserAddressVO(UserShoppingAddress userShoppingAddress);


    List<UserAddressVO> convertToUserAddressVOList(List<UserShoppingAddress> list);
}