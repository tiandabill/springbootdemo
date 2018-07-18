package com.sayeu.springbootdemo.demo_api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics =  Arrays.asList(
				new Topic("spring","11","111"),
				new Topic("java","22","222"),
				new Topic("javascript","33","333")
				);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
