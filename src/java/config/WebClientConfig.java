/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import static constant.BaseUrlConStant.BASE_URI;
import static constant.BaseUrlConStant.DEATH_TOLL_DATA;
import static constant.BaseUrlConStant.REPORT_TIMELINE_ALL_CASE_LATER;
import static constant.BaseUrlConStant.TO_DAY_CASE_ALL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author User
 */
public class WebClientConfig {

    private final Client client = ClientBuilder.newClient();

    public String caseDeath() {

        String caseDeath
                = client.target(BASE_URI)
                        .path(DEATH_TOLL_DATA)
                        .request(MediaType.APPLICATION_XML)
                        .get(String.class);
        return caseDeath;
    }

    public String getToDayCaseAll() {

        String caseDeath
                = client.target(BASE_URI)
                        .path(TO_DAY_CASE_ALL)
                        .request(MediaType.APPLICATION_XML)
                        .get(String.class);
        return caseDeath;
    }

    public String getReportTimelineLater() {

        String caseDeath
                = client.target(BASE_URI)
                        .path(REPORT_TIMELINE_ALL_CASE_LATER)
                        .request(MediaType.APPLICATION_XML)
                        .get(String.class);
        return caseDeath;
    }

}
