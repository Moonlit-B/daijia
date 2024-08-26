package com.bjb.daijia.mgr.service;


import com.bjb.daijia.model.entity.system.SysUser;
import com.bjb.daijia.model.query.system.SysUserQuery;
import com.bjb.daijia.model.vo.base.PageVo;

public interface SysUserService {

    SysUser getById(Long id);

    void save(SysUser sysUser);

    void update(SysUser sysUser);

    void remove(Long id);

    PageVo<SysUser> findPage(Long page, Long limit, SysUserQuery sysUserQuery);

    void updateStatus(Long id, Integer status);


}
