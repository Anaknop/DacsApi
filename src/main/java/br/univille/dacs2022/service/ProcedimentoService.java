package br.univille.dacs2022.service;

import java.util.List;

import br.univille.dacs2022.dto.ProcedimentoDTO;

public interface ProcedimentoService {
    public List<ProcedimentoDTO> getAll();

    public ProcedimentoDTO save(ProcedimentoDTO paciente);

    public ProcedimentoDTO findById(long id);

    public ProcedimentoDTO delete(long id);

    public ProcedimentoDTO getById(long id);
}