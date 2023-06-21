package com.restTemplate.serviceImpementation;

import com.restTemplate.output.PostResponseBean;
import com.restTemplate.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostalServiceImple implements IPostService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public PostResponseBean FetchPostOfficeDetailsByCity(String cityValue) {

        String url ="https://api.postalpincode.in/postoffice/{city}";
        url= url.replace("{city}" , cityValue);
        ResponseEntity<PostResponseBean[]> poResponseEntity;
        poResponseEntity= restTemplate.getForEntity(url,PostResponseBean[].class);
        PostResponseBean[] postResponseBeans = poResponseEntity.getBody();
        System.out.println("length" +postResponseBeans.length);
        return postResponseBeans[0];
    }
}
