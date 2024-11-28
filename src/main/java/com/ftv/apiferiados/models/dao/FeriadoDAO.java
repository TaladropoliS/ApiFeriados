package com.ftv.apiferiados.models.dao;

import com.ftv.apiferiados.models.dto.FeriadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FeriadoDAO {

    @Autowired
    private RestTemplate restTemplate;

    private final String ApiUrlBase = "https://api.boostr.cl/holidays.json";

    public List<FeriadoDTO> getFeriados() {

        List<FeriadoDTO> listFeriados = new ArrayList<>();

        ResponseEntity<FeriadoDTO> response = restTemplate.exchange(
                ApiUrlBase,
                HttpMethod.GET,
                null,
                FeriadoDTO.class
        );
        listFeriados.add(response.getBody());

        return listFeriados;
    }
}
