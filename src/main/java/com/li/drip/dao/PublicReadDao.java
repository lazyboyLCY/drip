package com.li.drip.dao;

import com.li.drip.entity.Read;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicReadDao {
    Boolean saveRead(Read read);
    Boolean deleteRead(Read read);
    List<Read> searchRead(Read read);
}
