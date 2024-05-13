package com.example.buensaborback.business.facade.Base;

import com.example.buensaborback.domain.dto.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseFacade <D extends BaseDto, ID extends Serializable>{
    public D createNew(D request);
    public D getById(Long id);
    public List<D> getAll();
    public void deleteById(Long id);
    public D update(D request, Long id);
}
