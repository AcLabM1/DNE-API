package com.aclab.dne.converter;

import com.aclab.dne.dto.ResponsableFormationDTO;
import com.aclab.dne.model.ResponsableFormation;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResponsableFormationConverter {

    private static final Logger log = LoggerFactory.getLogger(ResponsableFormationConverter.class);

    public ResponsableFormationDTO entityToDTO(ResponsableFormation responsableFormation) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(responsableFormation, ResponsableFormationDTO.class);
    }

    public List<ResponsableFormationDTO> entityToDTO(List<ResponsableFormation> responsableFormations) {
        log.debug("IN");
        return responsableFormations.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public ResponsableFormation dtoToEntity(ResponsableFormationDTO responsableFormationDTO) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(responsableFormationDTO, ResponsableFormation.class);
    }

    public List<ResponsableFormation> dtoToEntity(List<ResponsableFormationDTO> responsableFormationDTOS) {
        log.debug("IN");
        return responsableFormationDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
