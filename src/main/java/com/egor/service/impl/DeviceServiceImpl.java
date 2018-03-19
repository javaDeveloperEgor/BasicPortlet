package com.egor.service.impl;

import com.egor.entity.Device;
import com.egor.repository.DeviceDao;
import com.egor.repository.impl.DeviceDaoImpl;
import com.egor.service.DeviceService;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class DeviceServiceImpl implements DeviceService {

    DeviceDaoImpl deviceDao = DeviceDaoImpl.getDaoInstance();

    @Override
    public Collection<Device> getAllDevices() {
        return deviceDao.getAllDevices();
    }

    @Override
    public Device getDeviceById(long id) {
        return deviceDao.getDeviceById(id);
    }

    @Override
    public Device saveDevice(Device device) {
        return deviceDao.saveDevice(device);
    }
}
