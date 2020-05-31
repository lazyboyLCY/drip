package com.li.drip.service;

import com.li.drip.entity.Information;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PublicInformationService {
    Boolean saveInformation(Information information, HttpServletRequest request);
    Boolean deleteInformation(Information information);
    List<Information> searchInformation(Information information);
}
