package com.github.fttroy.workstep.service;

import com.github.fttroy.workstep.enumeration.Status;
import com.github.fttroy.workstep.model.entity.Request;
import com.github.fttroy.workstep.repository.RequestRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    RequestRepository repository;

    public Request save(Request request) {
        return repository.save(request);
    }

    public Request findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Request update(Request request) {
        Request requestDb = repository.findById(request.getId()).orElseThrow();
        BeanUtils.copyProperties(request, requestDb);
        return repository.save(requestDb);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
