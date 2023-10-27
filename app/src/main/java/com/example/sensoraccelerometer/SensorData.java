package com.example.sensoraccelerometer;

public class SensorData {
    private int id;

    // accelerometer axes data
    private float ax;
    private float ay;
    private float az;

    // gyroscope axes data
    private float gx;
    private float gy;
    private float gz;

    public SensorData(int id, float in_ax, float in_ay, float in_az, float in_gx, float in_gy, float in_gz)
    {
        ax = in_ax;
        ay = in_ay;
        az = in_az;

        gx = in_gx;
        gy = in_gy;
        gz = in_gz;

    }
    public SensorData(){};

    public int getId() {
        return id;
    }

    public float getAx() {
        return ax;
    }

    public float getAy() {
        return ay;
    }

    public float getAz() {
        return az;
    }
    public float getGx() { return gx; }

    public float getGy() { return gy; }

    public float getGz() { return gz; }

    public void setId(int id) {
        this.id = id;
    }

    public void setAx(float ax) {
        this.ax = ax;
    }

    public void setAy(float ay) {
        this.ay = ay;
    }

    public void setAz(float az) { this.az = az; }
    public void setGx(float gx) { this.gx = gx; }

    public void setGy(float gy) { this.gy = gy; }

    public void setGz(float gz) { this.gz = gz; }
}
