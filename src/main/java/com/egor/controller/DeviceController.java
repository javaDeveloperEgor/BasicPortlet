package com.egor.controller;

import com.egor.entity.Device;
import com.egor.service.DeviceService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/device/getAllDevices")
    public @ResponseBody String getAllDevices(){
        Collection<Device> devices = deviceService.getAllDevices();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("devices", devices);
        return jsonObject.toString();
    }

    @RequestMapping("/device/get/{deviceId})")
    public @ResponseBody String getDeviceById(@PathVariable long deviceId){
        Device device = deviceService.getDeviceById(deviceId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("device", device);
        return jsonObject.toString();
    }
}
