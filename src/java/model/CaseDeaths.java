/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author User
 */
@Data
@Builder
public class CaseDeaths {
  
    private Integer year;
    private Integer weeknum;
    private String province;
    private String age;
    private String age_range;
    private String occupation;
    private String update_date;

    
    
  
    
}
