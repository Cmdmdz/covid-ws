/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import config.WebClientConfig;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "covidList")
public class CovidService {

     WebClientConfig clientConfig;

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "caseDeath")
    public String caseDeath() {
        clientConfig = new WebClientConfig();
        return clientConfig.caseDeath();
    }

    @WebMethod(operationName = "caseAll")
    public String getToDayCaseAll() {
        clientConfig = new WebClientConfig();
        return clientConfig.getToDayCaseAll();
    }

    @WebMethod(operationName = "report")
    public String getReportTimelineLater() {
        clientConfig = new WebClientConfig();
        return clientConfig.getReportTimelineLater();
    }

}
