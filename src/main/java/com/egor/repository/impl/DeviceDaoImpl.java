package com.egor.repository.impl;

import com.egor.entity.Device;
import com.egor.repository.DeviceDao;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DeviceDaoImpl implements DeviceDao{

    private Map<Long, Device> devices = new HashMap<>();
    private static DeviceDaoImpl deviceDao;

    private DeviceDaoImpl(){
        initialize();
    }

    public static DeviceDaoImpl getDaoInstance() {
        if (deviceDao == null) {
            deviceDao = new DeviceDaoImpl();
        }
        return deviceDao;
    }

    @Override
    public Device saveDevice(Device device){
        device.setId(devices.size() + 1);
        return device;
    }

    @Override
    public Collection<Device> getAllDevices(){
        return devices.values();
    }

    @Override
    public Device getDeviceById(long id){
        return devices.get(id);
    }

    private void initialize(){

        Device router = new Device();
        router.setName("router");
        router.setType("wireless device");
        saveDevice(router);


        Device networkCard = new Device();
        networkCard.setName("networkCard");
        networkCard.setType("device for computer");
        saveDevice(networkCard);


        Device mobilePhone = new Device();
        mobilePhone.setName("mobilePhone");
        mobilePhone.setType("wireless device");
        saveDevice(mobilePhone);
    }
}
