package com.jdbc_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Baea {
    private Integer id;
    private Double lat_y_dd;
    private Double long_x_dd;
    private String status;
    private Integer nest_id;

    public Baea() {
    }

    public Baea(Integer id, Double lat_y_dd, Double long_x_dd, String status, Integer nest_id) {
        this.id = id;
        this.lat_y_dd = lat_y_dd;
        this.long_x_dd = long_x_dd;
        this.status = status;
        this.nest_id = nest_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLat_y_dd() {
        return lat_y_dd;
    }

    public void setLat_y_dd(Double lat_y_dd) {
        this.lat_y_dd = lat_y_dd;
    }

    public Double getLong_x_dd() {
        return long_x_dd;
    }

    public void setLong_x_dd(Double long_x_dd) {
        this.long_x_dd = long_x_dd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNest_id() {
        return nest_id;
    }

    public void setNest_id(Integer nest_id) {
        this.nest_id = nest_id;
    }

    @Override
    public String toString() {
        return "\nBaea{" +
                "id=" + id +
                ", lat_y_dd=" + lat_y_dd +
                ", long_x_dd=" + long_x_dd +
                ", status='" + status + '\'' +
                ", nest_id=" + nest_id +
                '}';
    }
}
