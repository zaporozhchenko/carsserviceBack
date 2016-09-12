package com.cservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Transactional
@Controller
//@ComponentScan(basePackages = "com.cservice")
@RequestMapping(value = "contractor", produces = MediaType.APPLICATION_JSON_VALUE)
public class CS_Controller_Contractor {
    private static final Logger log = LoggerFactory.getLogger(CS_Controller_Contractor.class);

//    @Autowired
//    private ContractorRepository contractorRepository;
//
//
//    //returns list of available contractors
//    @ResponseStatus(HttpStatus.OK)
//    @RequestMapping(method = RequestMethod.POST)
//    public void addContractor(@RequestBody Contractor contractor) {
//
//        log.info(contractor.toString());
//        contractorRepository.save(contractor);
//
//        System.out.println(contractor);
//
//    }
//
//
//    //returns list of available contractors
//    @ResponseStatus(HttpStatus.OK)
//    @RequestMapping( method = RequestMethod.GET)
//    public Contractor getByEmail(@RequestParam("email") String email) {
//        System.out.println(email);
//
//        return contractorRepository.findByEmail(email);
//    }

//    //returns list of available contractors
//    @ResponseStatus(HttpStatus.OK)
//    @RequestMapping(value = "{type}/{value}", method = RequestMethod.GET)
//    public String add(@PathVariable String type, @PathVariable String value) {
//
//        System.out.println("type=" + type + " value=" + value);
//
//        return "pong";
//    }




}
