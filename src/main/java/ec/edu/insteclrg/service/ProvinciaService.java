package ec.edu.insteclrg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Provincia;
import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.persistence.ProvinciaRepository;

@Service
public class ProvinciaService {
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	
	public void guardar(ProvinciaDTO provinciaDTO){
		Provincia provincia = new Provincia();
		provincia.setId(provinciaDTO.getId());
		provincia.setNombre(provinciaDTO.getNombre());
		
		provinciaRepository.save(provincia);
	}
	
}
