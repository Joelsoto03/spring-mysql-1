package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domain.Ciudad;
import ec.edu.insteclrg.domain.Provincia;

	public interface CiudadRepository extends JpaRepository<Ciudad, Long>{
		public Ciudad findByNombre(String nombre);
	}
