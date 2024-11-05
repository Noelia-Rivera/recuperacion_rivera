package pe.com.coches.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.com.coches.entity.Tipocoche;
import pe.com.coches.service.TipococheService;

@RestController
@RequestMapping("/api/tipos")
@CrossOrigin(origins = "http://localhost:4200")
public class TipococheController {
	@Autowired
	private TipococheService service;
	
	@GetMapping
	public ResponseEntity<List<Tipocoche>> readAll() {
		try {
			List<Tipocoche> tipo = service.readAll();
			if (tipo.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(tipo, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Tipocoche> crearTipocoche(@Valid @RequestBody Tipocoche ti) {
		try {
			Tipocoche t = service.create(ti);
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tipocoche> getTipococheId(@PathVariable("id") Long id) {
		try {
			Tipocoche t = service.read(id).get();
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipocoche> delTipocoche(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Tipocoche> updateTipocoche(@PathVariable("id") Long id, @Valid @RequestBody Tipocoche ti) {
		Optional<Tipocoche> t = service.read(id);
		if (t.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(ti), HttpStatus.OK);
			
		}
	}
}
