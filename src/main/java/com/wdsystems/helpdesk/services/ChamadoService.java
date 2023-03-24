package com.wdsystems.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdsystems.helpdesk.domain.Chamado;
import com.wdsystems.helpdesk.repositories.ChamadoRepository;
import com.wdsystems.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository chamadoRepository;

	public Chamado findById(Integer id) {

		Optional<Chamado> obj = chamadoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Chamado not found - ID: " + id));
	}

	public List<Chamado> findAll() {
		return chamadoRepository.findAll();
	}
}