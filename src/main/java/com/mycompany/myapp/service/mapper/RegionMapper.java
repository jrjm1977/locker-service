package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Region;
import com.mycompany.myapp.service.dto.RegionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Region} and its DTO {@link RegionDTO}.
 */
@Mapper(componentModel = "spring", uses = { CountryMapper.class })
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {
    @Mapping(target = "country", source = "country", qualifiedByName = "id")
    RegionDTO toDto(Region s);
}
