package com.restTemplate.service;

import com.restTemplate.output.PostResponseBean;
import org.springframework.stereotype.Service;


public interface IPostService {

    public PostResponseBean FetchPostOfficeDetailsByCity(String city);


}
