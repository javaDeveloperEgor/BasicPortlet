package com.egor.service;

import com.egor.entity.Device;

import java.util.Collection;

public interface DeviceService {
    Collection<Device> getAllDevices();
    Device getDeviceById(long id);
    Device saveDevice(Device device);
}
