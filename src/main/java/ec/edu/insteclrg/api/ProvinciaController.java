package ec.edu.insteclrg.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.service.ProvinciaService;

@RestController
@RequestMapping("/api/provincia")
public class ProvinciaController {
	
	@Autowired
	ProvinciaService provinciaService;
	
	@PostMapping
	public String guardar(@RequestBody ProvinciaDTO provinciaDTO) {
		provinciaService.guardar(provinciaDTO);
		return "guardado correctamente";
	}
}
