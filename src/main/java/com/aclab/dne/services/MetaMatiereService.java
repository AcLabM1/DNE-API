package com.aclab.dne.services;

import com.aclab.dne.converter.MetaMatiereConverter;
import com.aclab.dne.dto.MetaMatiereDTO;
import com.aclab.dne.model.MetaMatiere;
import com.aclab.dne.repositories.MetaMatiereRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Transactional
@AllArgsConstructor
@Service
public class MetaMatiereService {


    private final MetaMatiereRepository metaMatiereRepository;
    private final MetaMatiereConverter metaMatiereConverter;

    public List<MetaMatiereDTO> findAllMetaMatieres(){
        Iterable<MetaMatiere> metaMatieres = this.metaMatiereRepository.findAll();
        if(IterableUtils.size(metaMatieres) > 0 ){
            return this.metaMatiereConverter.entityToDTO(IterableUtils.toList(metaMatieres));
        }else{
            throw new NoSuchElementException("pas de notes");
        }
    }



    public MetaMatiereDTO createInscription(MetaMatiereDTO newMetaMatiereDTO){
        return metaMatiereConverter.entityToDTO((metaMatiereRepository.save(this.metaMatiereConverter.dtoToEntity(newMetaMatiereDTO))));
    }

}
