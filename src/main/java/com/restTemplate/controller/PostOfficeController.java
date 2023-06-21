package com.restTemplate.controller;

import com.fasterxml.jackson.annotation.JsonValue;
import com.restTemplate.output.PostResponseBean;
import com.restTemplate.service.IPostService;
import com.restTemplate.serviceImpementation.PostalServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postal")
public class PostOfficeController {

    @Autowired
    IPostService iPostService;

    @RequestMapping(value = "/bycity" , method = RequestMethod.GET
    ,consumes = MediaType.ALL_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE
    )
  //  @GetMapping("/bycity")
    public PostResponseBean getPostalByCity(@RequestParam String city)
    {
        PostResponseBean postResponseBean;
        postResponseBean=iPostService.FetchPostOfficeDetailsByCity(city);
     return  postResponseBean;
    }
}
