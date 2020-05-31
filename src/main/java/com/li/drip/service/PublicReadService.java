package com.li.drip.service;



import com.li.drip.entity.Read;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PublicReadService {
    Boolean saveRead(Read read, HttpServletRequest request);
    Boolean deleteRead(Read read);
    List<Read> searchRead(Read read);
}
