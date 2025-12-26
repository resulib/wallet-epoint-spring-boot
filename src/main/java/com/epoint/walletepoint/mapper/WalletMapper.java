package com.epoint.walletepoint.mapper;

import com.epoint.walletepoint.dto.WalletDto;
import com.epoint.walletepoint.entity.WalletEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WalletMapper {

    @Mapping(target = "walletId", source = "id")
    WalletDto toDto(WalletEntity wallet);
}
