package com.aclab.dne.converter;

import com.aclab.dne.dto.EmployeDTO;
import com.aclab.dne.model.Employe;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeConverter {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeConverter.class);

    public EmployeDTO entityToDTO(Employe employe){
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(employe,EmployeDTO.class);
    }

    public List<EmployeDTO> entityToDTO(List<Employe> employes){
        LOG.debug("IN");
        return employes.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Employe dtoToEntity(EmployeDTO employeDTO){
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(employeDTO,Employe.class);
    }

    public List<Employe> dtoToEntity(List<EmployeDTO> employeDTOS){
        LOG.debug("IN");
        return employeDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
