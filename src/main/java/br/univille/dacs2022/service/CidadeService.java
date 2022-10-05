package br.univille.dacs2022.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.dacs2022.dto.CidadeDTO;

public interface CidadeService {
    public List<CidadeDTO> getAll();
    public CidadeDTO findById(long id);
}
