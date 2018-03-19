package com.egor.repository;

import com.egor.entity.Device;

import java.util.Collection;

public interface DeviceDao {

    Collection<Device> getAllDevices();
    Device getDeviceById(long id);
    Device saveDevice(Device device);
}
