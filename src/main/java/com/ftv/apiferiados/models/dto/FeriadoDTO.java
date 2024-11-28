package com.ftv.apiferiados.models.dto;

import java.util.List;


public class FeriadoDTO {

    private String status;
    private List<DataDTO> data;

    public FeriadoDTO(String status, List<DataDTO> data) {
        this.status = status;
        this.data = data;
    }

    public FeriadoDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FeriadoDTO{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
