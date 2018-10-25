/**
 * 
 */
package com.example.data;

/**
 * @author ab68478
 *
 */
public class DeviceVO {
	private int deviceId;
	private String deviceClli;
	private String state;
	private String siteClli;
	private String exchName;
	private String siteName;

	public DeviceVO(int deviceId, String deviceClli, String state, String siteClli, String exchName, String siteName) {
		super();
		this.deviceId = deviceId;
		this.deviceClli = deviceClli;
		this.state = state;
		this.siteClli = siteClli;
		this.exchName = exchName;
		this.siteName = siteName;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceClli() {
		return deviceClli;
	}

	public void setDeviceClli(String deviceClli) {
		this.deviceClli = deviceClli;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSiteClli() {
		return siteClli;
	}

	public void setSiteClli(String siteClli) {
		this.siteClli = siteClli;
	}

	public String getExchName() {
		return exchName;
	}

	public void setExchName(String exchName) {
		this.exchName = exchName;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Override
	public String toString() {
		return "DeviceVO [deviceId=" + deviceId + ", deviceClli=" + deviceClli + ", state=" + state + ", siteClli="
				+ siteClli + ", exchName=" + exchName + ", siteName=" + siteName + "]";
	}

}
