package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.Page;
import com.aiwen.logistics.pojo.ReleaseSource;
import com.aiwen.logistics.pojo.ReleaseSourceExample;

import java.util.List;

/**
 * Created by ASUS on 2018/4/26.
 */
public interface ReleaseSourceService {
    public List<ReleaseSource> findReleaseSourceList(ReleaseSourceExample releaseSource);

    public int addReleaseSource(ReleaseSource releaseSource);

    public ReleaseSource findById(String id);

    public int deleteById(String id);

    public List<ReleaseSource> findReleaseSourceListByUserId(Integer id);
}
