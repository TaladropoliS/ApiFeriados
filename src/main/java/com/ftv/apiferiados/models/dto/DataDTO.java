package com.ftv.apiferiados.models.dto;

public class DataDTO {

    private String date;
    private String title;
    private String type;
    private Boolean inalienable;
    private String extra;

    public DataDTO(String date, String title, String type, Boolean inalienable, String extra) {
        this.date = date;
        this.title = title;
        this.type = type;
        this.inalienable = inalienable;
        this.extra = extra;
    }

    public DataDTO() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getInalienable() {
        return inalienable;
    }

    public void setInalienable(Boolean inalienable) {
        this.inalienable = inalienable;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", inalienable=" + inalienable +
                ", extra='" + extra + '\'' +
                '}';
    }

    //    private DataDetails data;
//
//    public DataDTO(DataDetails data) {
//        this.data = data;
//    }
//
//    public DataDTO() {
//    }
//
//    public DataDetails getData() {
//        return data;
//    }
//
//    public void setData(DataDetails data) {
//        this.data = data;
//    }
//
//    @Override
//    public String toString() {
//        return "DataDTO{" +
//                "data=" + data +
//                '}';
//    }
}
