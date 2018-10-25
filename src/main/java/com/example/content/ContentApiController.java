/**
 * 
 */
package com.example.content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.DeviceVO;
import com.example.service.ContentService;

/**
 * @author ab68478
 *
 */
@RestController
public class ContentApiController {
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/devices")
	public List<DeviceVO> getContents(@RequestBody DeviceVO params) {
		System.out.println(params.toString());
		return contentService.getDevices(params);
	}
	
}
