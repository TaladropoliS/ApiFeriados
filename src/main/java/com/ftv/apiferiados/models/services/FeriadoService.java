package com.ftv.apiferiados.models.services;

import com.ftv.apiferiados.models.dao.FeriadoDAO;
import com.ftv.apiferiados.models.dto.FeriadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeriadoService {

    @Autowired
    private FeriadoDAO feriadoDAO;

    public List<FeriadoDTO> getFeriados() {
        return feriadoDAO.getFeriados();
    }
}
