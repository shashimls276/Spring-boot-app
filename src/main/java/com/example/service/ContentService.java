/**
 * 
 */
package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.data.DeviceVO;
import com.example.utility.CommonUtils;

/**
 * @author ab68478
 *
 */
@Service
public class ContentService {
	private static List<DeviceVO> devicesList = new ArrayList<DeviceVO>();
	
	static {
		 devicesList.add(new DeviceVO(1, "DEMOCLLI1", "AL", "DEMOSITE1", "exch", "siteName"));
		 devicesList.add(new DeviceVO(2, "DEMOCLLI2", "AL", "DEMOSITE2", "exch", "siteName"));
		 devicesList.add(new DeviceVO(3, "DEMOCLLI3", "AL", "DEMOSITE3", "exch", "siteName"));
		 devicesList.add(new DeviceVO(4, "DEMOCLLI4", "AL", "DEMOSITE4", "exch", "siteName"));
		 devicesList.add(new DeviceVO(5, "DEMOCLLI5", "AL", "DEMOSITE5", "exch", "siteName"));
		 devicesList.add(new DeviceVO(6, "DEMOCLLI6", "AL", "DEMOSITE6", "exch", "siteName"));
		 devicesList.add(new DeviceVO(7, "DEMOCLLI7", "AL", "DEMOSITE7", "exch", "siteName"));
		 devicesList.add(new DeviceVO(8, "DEMOCLLI8", "AL", "DEMOSITE8", "exch", "siteName"));
		 devicesList.add(new DeviceVO(9, "DEMOCLLI9", "AL", "DEMOSITE9", "exch", "siteName"));
		 devicesList.add(new DeviceVO(10, "DEMOCLLI10", "AL", "DEMOSITE10", "exch", "siteName"));
		 devicesList.add(new DeviceVO(11, "DEMOCLLI11", "AL", "DEMOSITE1", "exch", "siteName"));
		 devicesList.add(new DeviceVO(12, "DEMOCLLI12", "AL", "DEMOSITE2", "exch", "siteName"));
		 devicesList.add(new DeviceVO(13, "DEMOCLLI13", "AL", "DEMOSITE3", "exch", "siteName"));
		 devicesList.add(new DeviceVO(14, "DEMOCLLI14", "AL", "DEMOSITE4", "exch", "siteName"));
		 devicesList.add(new DeviceVO(15, "DEMOCLLI15", "AL", "DEMOSITE5", "exch", "siteName"));
		 devicesList.add(new DeviceVO(16, "DEMOCLLI16", "AL", "DEMOSITE6", "exch", "siteName"));
		 devicesList.add(new DeviceVO(17, "DEMOCLLI17", "AL", "DEMOSITE7", "exch", "siteName"));
		 devicesList.add(new DeviceVO(18, "DEMOCLLI18", "AL", "DEMOSITE8", "exch", "siteName"));
		 devicesList.add(new DeviceVO(19, "DEMOCLLI19", "AL", "DEMOSITE9", "exch", "siteName"));
		 devicesList.add(new DeviceVO(20, "DEMOCLLI20", "AL", "DEMOSITE10", "exch", "siteName"));
		 
		 devicesList.add(new DeviceVO(11, "DEMOCLLI1", "CO", "DEMOSITE1", "exch", "siteName"));
		 devicesList.add(new DeviceVO(12, "DEMOCLLI2", "CO", "DEMOSITE2", "exch", "siteName"));
		 devicesList.add(new DeviceVO(13, "DEMOCLLI3", "CO", "DEMOSITE3", "exch", "siteName"));
		 devicesList.add(new DeviceVO(14, "DEMOCLLI4", "CO", "DEMOSITE4", "exch", "siteName"));
		 devicesList.add(new DeviceVO(15, "DEMOCLLI5", "CO", "DEMOSITE5", "exch", "siteName"));
		 devicesList.add(new DeviceVO(16, "DEMOCLLI6", "CO", "DEMOSITE6", "exch", "siteName"));
		 devicesList.add(new DeviceVO(17, "DEMOCLLI7", "CO", "DEMOSITE7", "exch", "siteName"));
		 devicesList.add(new DeviceVO(18, "DEMOCLLI8", "CO", "DEMOSITE8", "exch", "siteName"));
		 devicesList.add(new DeviceVO(19, "DEMOCLLI9", "CO", "DEMOSITE9", "exch", "siteName"));
		 devicesList.add(new DeviceVO(20, "DEMOCLLI10", "CO", "DEMOSITE10", "exch", "siteName"));
	}
	
	public List<DeviceVO> getDevices(DeviceVO param) {
		List<DeviceVO> searchResult = new ArrayList<DeviceVO>();
		boolean deviceExist = false;
		for(DeviceVO deviceVO : devicesList) {
			deviceExist = false;
			
			if(param.getDeviceId() > 0)
				if(deviceVO.getDeviceId() == param.getDeviceId())
						deviceExist = true;
				else
					deviceExist = false;
			
			if(!CommonUtils.isEmpty(param.getDeviceClli()))
				if(deviceVO.getDeviceClli().equalsIgnoreCase(param.getDeviceClli().trim()))
					deviceExist = true;
				else
					deviceExist = false;
			
			if(!CommonUtils.isEmpty(param.getState()) && !(param.getState().trim().equalsIgnoreCase("select state")))
				if(deviceVO.getState().equalsIgnoreCase(param.getState().trim()))
					deviceExist = true;
				else
					deviceExist = false;
			
			if(!CommonUtils.isEmpty(param.getSiteClli()))
				if(deviceVO.getSiteClli().equalsIgnoreCase(param.getSiteClli().trim()))
					deviceExist = true;
				else
					deviceExist = false;
			
			if(!CommonUtils.isEmpty(param.getSiteName()))
				if(deviceVO.getSiteName().equalsIgnoreCase(param.getSiteName().trim()))
					deviceExist = true;
				else
					deviceExist = false;
			
			if(!CommonUtils.isEmpty(param.getExchName()))
				if(deviceVO.getExchName().equalsIgnoreCase(param.getExchName().trim()))
					deviceExist = true;
				else
					deviceExist = false;
			if(deviceExist)
				searchResult.add(deviceVO);
			
		}
		
		 return searchResult;
	}
	

}
